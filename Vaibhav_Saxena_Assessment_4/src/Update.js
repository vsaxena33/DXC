import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from "react-router-dom"
import ProductDetails from './ProductDetails'
import ProductDisplay from './ProductDisplay'

export default class Update extends Component {
    

    constructor(props){
        super(props)
        this.state = {
            ProductToBeUpdated : 0,
            UpdatedQuantity : 0,
            productList: [
            {
                productId: 1001,
                productName: 'Watch',
                quantityOnHand: 2000,
                price: 10000
            },
            {
                productId: 1002,
                productName: 'Mouse',
                quantityOnHand: 29,
                price: 180000
            },
            {
                productId: 1003,
                productName: 'Laptop',
                quantityOnHand: 29,
                price: 122
            },
            {
                productId: 10113,
                productName: 'Presenter',
                quantityOnHand: 29,
                price: 122
            },

            {
                productId: 111003,
                productName: 'Marker',
                quantityOnHand: 29,
                price: 122
            },
        ]}
    }

    handleIdChange=(e)=>{
        this.setState({
            ProductToBeUpdated : e.target.value})
    }

    handleQTYChange=(e)=>{
        this.setState({
            UpdatedQuantity : e.target.value})
    }

    updateStock = (e) => {
        e.preventDefault()
        const {ProductToBeUpdated,UpdatedQuantity,productList} = this.state
        var prodList = productList
        prodList[productList.findIndex(x => x.productId == ProductToBeUpdated)].quantityOnHand = UpdatedQuantity
        this.setState({
            productList : prodList
        })

    }

    updateDetails=(productId, qty)=>{
        var arr = this.state.productList
        arr[productId].quantityOnHand = qty
        this.setState({
            productList: arr
        })
    }

    render() {
        return (
            <div>
                <form>
                    <h1>Update Product</h1>
                        Enter ProductID: <input type='text' name='productId' ref='productId' onChange={this.handleIdChange} /><br />
                        Quantity On Hand: <input type='text' name='quantity' ref='quantity' onChange={this.handleQTYChange}/><br />
                        <button onClick={this.updateDetails}>Update</button>
                </form>
                {this.state.productList.map((product, index) =>
                    <Link to={`${this.props.match.url}/` + product.productName}>
                        <ProductDisplay render={({ match }) => match = { match }}
                            nn={index}
                            key={index}
                            product={product}
                        ></ProductDisplay>
                    </Link>

                )}
                <Route path={`${this.props.match.path}/:productName`}
                    render={({ match }) => match = { match }}
                    component={ProductDetails} />
            </div>
        )
    }
}
