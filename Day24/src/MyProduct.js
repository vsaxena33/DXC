import React from "react";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import ProductList from "./ProductList";
import ProductDisplay from "./ProductDisplay";
export default function MyProduct() {
    return (
        <Router>
            <div>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/about" >About</Link>
                    </li>
                    <li>
                        <Link to="/product">Product</Link>
                    </li>
                </ul>
                <hr />
                <Route exact path="/" component={Home} />
                <Route path="/about" component={About} />
                <Route path="/product" component={Product} />
            </div>
        </Router>
    );
}

function Home() {
    return (
        <div>
            <h2>Home</h2>
        </div>
    );
}
function About() {
    return (
        <div>
            <h2>About</h2>
        </div>
    );
}
function Product({ match }) {
    return (
        <div>
            <h2>Product</h2>
            <ProductList></ProductList>
            <Route path={`${match.path}/:productId`} 
                component={ProductDisplay} />
        </div>
    );
}
