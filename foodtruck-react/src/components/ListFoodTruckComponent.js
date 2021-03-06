import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom';
import FoodTruckService from '../services/FoodTruckService'

const ListFoodTruckComponent = () => {

    const [foodtrucks, setFoodTrucks] = useState([])

    useEffect(() => {

        getAllFoodTrucks();
    }, [])

    const getAllFoodTrucks = () => {
        FoodTruckService.getAllFoodTrucks().then((response) => {
            setFoodTrucks(response.data);
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })
    }

    const deleteFoodTruck = (foodtruckId) => {
        FoodTruckService.deleteFoodTruck(foodtruckId).then((response) => {
            getAllFoodTrucks();
        }).catch(error => {
            console.log(error);
        })
    }

    return (
        <div className="container">
            <br/><br/>
            <h2 className="text-center"> List Food Trucks </h2>

            <Link to="/add-foodtruck" className="btn btn-primary mb-2"> Add Food Truck </Link>

            <table className="table table-bordered table-striped">
                <thead>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Food</th>
                <th>Actions</th>
                </thead>
                <tbody>
                {
                    foodtrucks.map(
                        foodtruck =>
                            <tr key={foodtruck.id}>
                                <td> {foodtruck.id} </td>
                                <td> {foodtruck.name} </td>
                                <td> {foodtruck.address} </td>
                                <td> {foodtruck.food} </td>
                                <td>
                                    <Link className="btn btn-info" to={`/edit-foodtruck/${foodtruck.id}`}> Update </Link>
                                    <button className="btn btn-danger" onClick={() => deleteFoodTruck(foodtruck.id)}
                                            style={{ marginLeft: "10px" }} > Delete </button>
                                </td>
                            </tr>
                    )
                }
                </tbody>
            </table>
        </div>
    )
}

export default ListFoodTruckComponent