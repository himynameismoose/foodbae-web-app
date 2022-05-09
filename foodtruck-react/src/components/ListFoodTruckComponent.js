import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom';
import FoodTruckService from '../services/FoodTruckService'

const ListFoodTruckComponent = () => {

    const [foodtrucks, setFoodTrucks] = useState([])

    useEffect(() => {

        FoodTruckService.getAllFoodTrucks().then((response) => {
            setFoodTrucks(response.data);
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })
    }, [])


    return (
        <div className="container">
            <h2 className="text-center"> List Food Trucks </h2>

            <Link to="/add-foodtruck" className="btn btn-primary mb-2"> Add Food Truck </Link>

            <table className="table table-bordered table-striped">
                <thead>
                <th>Name</th>
                <th>Address</th>
                <th>Food</th>
                </thead>
                <tbody>
                {
                    foodtrucks.map(
                        foodtruck =>
                            <tr key={foodtruck.id}>
                                <td> {foodtruck.name} </td>
                                <td> {foodtruck.address} </td>
                                <td> {foodtruck.food} </td>
                            </tr>
                    )
                }
                </tbody>
            </table>
        </div>
    )
}

export default ListFoodTruckComponent