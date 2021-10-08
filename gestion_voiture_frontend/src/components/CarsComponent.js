import React from 'react';
import CarsService from '../services/CarsService';

class CarsComponent extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            cars : []
        }
    }

    componentDidMount() {
        CarsService.getAllCar().then(response => {
            this.setState({ cars : response.data })
        });
    }

    render() {
        return(
            <div>
                <h1 className = "text-center">Liste voiture</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <th>Numéro d'immatriculation</th>
                            <th>Price</th>
                            <th>Modèle</th>
                            <th>Contact</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.cars.map(
                                car =>
                                <tr key = {car.id}>
                                    <td> 
                                        <a href={'/cars/'+car.id}>
                                            {car.immatriculation} 
                                        </a>
                                    </td>
                                    <td> {car.price} </td>
                                    <td> {car.model.value} </td>
                                    <td> {car.user.contact} </td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>    
        )
    }
}

export default CarsComponent