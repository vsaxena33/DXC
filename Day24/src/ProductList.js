import React, { Component } from 'react'
import ProductDisplay from './ProductDisplay'
import { BrowserRouter as Link } from "react-router-dom";

export default class ProductList extends Component {
    render() {
        const productList = [
            {
                productId: 1001,
                productName: 'Watch',
                quantityOnHand: 2000,
                price: 10000,
            },
            {
                productId: 1002,
                productName: 'Laptop',
                quantityOnHand: 29,
                price: 180000,
            }
        ]
        return (
            <div>
                {productList.map((product, index) =>
                    <Link to={ProductDisplay}><ProductDisplay a={index} key={index} product={product}></ProductDisplay></Link>)}
            </div>
        )
    }
}
