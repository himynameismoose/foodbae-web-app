import React, {useEffect, useState} from 'react'
import { useNavigate, Link, useParams } from 'react-router-dom'
import FoodTruckService from '../services/FoodTruckService'

const AddFoodTruckComponent = () => {

    const [name, setName] = useState('')
    const [address, setAddress] = useState('')
    const [food, setFood] = useState('')
    const navigate = useNavigate();
    const {id} = useParams();

    const saveFoodTruck = (e) => {
        e.preventDefault();

        const foodtruck = {name, address, food}

        FoodTruckService.createFoodTruck(foodtruck).then((response) => {
            console.log(response.data)
            navigate('/foodtrucks')
        }).catch(error => {
            console.log(error)
        })
    }

    useEffect(() => {

        FoodTruckService.getFoodTruckById(id).then((response) => {
            setName(response.data.name)
            setAddress(response.data.address)
            setFood(response.data.food)
        }).catch(error => {
            console.log(error)
        })
    }, [])

    const title = () => {
        if(id) {
            return <h2 className="text-center"> Update Food Truck </h2>
        } else {
            return <h2 className="text-center"> Add Food Truck </h2>
        }
    }

    return (
        <div>
            <br/><br/>
            <div className="container">
                <div className="row">
                    <div className="card col-md-6 offset-md-3 offset-md-3">
                        <br />
                        {
                            title()
                        }
                        <div className="card-body ">
                            <form>
                                <div className="form-group mb-2">
                                    <label className="form-label"> Name </label>
                                    <input
                                        type="text"
                                        placeholder="Enter Food Truck Name"
                                        name="name"
                                        className="form-control"
                                        value={name}
                                        onChange={(e) => setName(e.target.value)}
                                    >
                                    </input>
                                </div>

                                <div className="form-group mb-2">
                                    <label className="form-label"> Address </label>
                                    <input
                                        type="text"
                                        placeholder="Enter Food Truck Address"
                                        name="address"
                                        className="form-control"
                                        value={address}
                                        onChange={(e) => setAddress(e.target.value)}
                                    >
                                    </input>
                                </div>

                                <div className="form-group mb-2">
                                    <label className="form-label"> Food Type </label>
                                    <input
                                        type="text"
                                        placeholder="Enter Food Type"
                                        name="food"
                                        className="form-control"
                                        value={food}
                                        onChange={(e) => setFood(e.target.value)}
                                    >
                                    </input>
                                </div>
                                <br />
                                <button className="btn btn-success" onClick={(e) => saveFoodTruck(e)}> Add Food Truck </button>
                                <Link to="/foodtrucks" className="btn btn-danger">Cancel</Link>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default AddFoodTruckComponent