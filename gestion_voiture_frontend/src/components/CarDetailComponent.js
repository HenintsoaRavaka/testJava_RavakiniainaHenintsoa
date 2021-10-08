import React from 'react';
import CarsService from '../services/CarsService';
import '../components/car.css';

class CarDetailComponent extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            car : {
                model : {
                    brand : {
                        category : {}
                    }
                },
                user : {}
            }
        }
    }

    componentDidMount() {
        CarsService.getCarById(this.props.match.params.id).then(response => {
            this.setState({ car : response.data})
        });
    }

    render() {
        var car = this.state.car;
        return(
            <div>
                <h1 className = "text-center">Détail {car.immatriculation}</h1>
                <div class="d-flex justify-content-center container mt-5">
                    <div class="card p-3 bg-white"><i class="fa fa-apple"></i>
                        <div class="about-product text-center mt-2"><img src={car.pictures} width="300"/>
                            <h4>{car.model.value}</h4>
                            <h5>{car.model.brand.value}</h5>
                            <h6 class="mt-0 text-black-50">{car.model.brand.category.value}</h6>
                        </div>
                        <div class="stats mt-2">
                            <div class="d-flex justify-content-between p-price"><span>Prix</span><span>${car.price}</span></div>
                            <div class="d-flex justify-content-between p-price"><span>Adresse</span><span>{car.user.address}</span></div>
                            <div class="d-flex justify-content-between p-price"><span>Contact</span><span>{car.user.contact} / {car.user.email} </span></div>
                        </div>
                    </div>
                    <a href={'/comments/'+car.id}>Voir les commentaires</a>
                </div>
            </div>    
        )
    }
}

export default CarDetailComponent