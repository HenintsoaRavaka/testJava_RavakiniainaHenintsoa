import React, { Component } from "react";
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";

import CarsComponent from './components/CarsComponent';
import CarDetailComponent from './components/CarDetailComponent';
import CommentsComponent from './components/CommentsComponent';

class App extends Component {
  render() {
    return (
      <div>
        <div className="container mt-3">
          <BrowserRouter>
            <Switch>
              <Route exact path={["/", "/cars"]} component={CarsComponent} />
              <Route path="/cars/:id" component={CarDetailComponent} />
              <Route path="/comments/:id" component={CommentsComponent} />
            </Switch>
          </BrowserRouter>
        </div>
      </div>
    );
  }
}

export default App;
