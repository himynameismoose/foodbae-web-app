import React, { useState} from 'react'

const ListFoodTruckComponent = () => {

    const [foodtrucks, setFoodTrucks] = useState([])

  return (
    <div className="container">
        <h2 className="text-center"> List Food Trucks </h2>
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