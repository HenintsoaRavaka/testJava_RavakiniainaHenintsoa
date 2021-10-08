import React from 'react';
import CarsService from '../services/CarsService';
import '../components/car.css';

class CommentsComponent extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            comments : []
        }
    }

    componentDidMount() {
        CarsService.getAllComment(this.props.match.params.id).then(response => {
            this.setState({ comments : response.data})
        });
    }

    render() {
        var comments = this.state.comments;
        return(
            <div>
                <h1 className = "text-center">Commentaire</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <th>Utilisateur</th>
                            <th>Voiture</th>
                            <th>Commentaire</th>
                            <th>Date</th>
                            <th>heure</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            comments.map(
                                comment =>
                                <tr key = {comment.id}>
                                    <td> 
                                        {comment.user.lastName}
                                    </td>
                                    <td> 
                                        <a href={'/cars/'+comment.car.id}>
                                            {comment.car.immatriculation} 
                                        </a> 
                                    </td>
                                    <td> {comment.comment} </td>
                                    <td> {comment.date} </td>
                                    <td> {comment.heure} </td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>   
        )
    }
}

export default CommentsComponent