import axios from 'axios'

const ALL_CAR_API_URL = "http://localhost:8088/car";
const CAR_BY_ID_API_URL = "http://localhost:8088/car/";
const COMMENTS_BY_CAR_API_URL = "http://localhost:8088/comment/";

class CarsService {

    getAllCar() {
        return axios.get(ALL_CAR_API_URL);
    }

    getCarById(id) {
        return axios.get(CAR_BY_ID_API_URL+id);
    }

    getAllComment(id) {
        return axios.get(COMMENTS_BY_CAR_API_URL+id);
    }
}

export default new CarsService();