import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import Customer from './Customer'
import ProductList from './ProductList'
import Home from './Home';
import About from './About';
import Update from './Update'


function App() {
  return (
    <div className="App">
      <Router>
        <div>
          <Link to="/">Home</Link>
          &nbsp; &nbsp; &nbsp; &nbsp;
          <Link to="/about" >About</Link>
          &nbsp; &nbsp; &nbsp; &nbsp;
          <Link to="/customers">Customers</Link>
          &nbsp; &nbsp; &nbsp; &nbsp;
          <Link to="/products">Products</Link>
          &nbsp; &nbsp; &nbsp; &nbsp;
          <Link to="/update">Update</Link>
          &nbsp; &nbsp; &nbsp; &nbsp;
          <hr />
          <Route exact path="/" component={Home} />
          <Route path="/customers" component={Customer} />
          <Route path="/about" component={About} />
          <Route path="/products"
            render={({ match }) => match = { match }}
            component={ProductList} />
            <Route path="/update" render={({ match }) => match = { match }} component={Update} />
        </div>
      </Router>
    </div>
  );
}

export default App;
