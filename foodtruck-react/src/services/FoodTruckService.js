import axios from 'axios'

const FOODTRUCK_BASE_REST_API_URL = 'http://localhost:8080/api/v1/foodtrucks';

class FoodTruckService {

    getAllFoodTrucks() {
        return axios.get(FOODTRUCK_BASE_REST_API_URL);
    }

    createFoodTruck(foodtruck) {
        return axios.post(FOODTRUCK_BASE_REST_API_URL, foodtruck);
    }

    getFoodTruckById(foodtruckId) {
        return axios.get(FOODTRUCK_BASE_REST_API_URL + '/' + foodtruckId);
    }

    updateFoodTruck(foodtruckId, foodtruck) {
        return axios.put(FOODTRUCK_BASE_REST_API_URL + '/' + foodtruckId, foodtruck);
    }

    deleteFoodTruck(foodtruckId) {
        return axios.delete(FOODTRUCK_BASE_REST_API_URL + '/' + foodtruckId);
    }
}

export default new FoodTruckService();