import React, { Component } from 'react';
import SingleContact from './SingleContact';
import AddContact from './AddContact';

export default class Contacts extends Component {
    constructor(props){
        super(props);
        this.state = {
            contacts: [],
        };
    }

    componentDidMount(){
        fetch('http://localhost:8083/api/contacts')
        .then(response => response.json())
        .then(data => this.setState({contacts: data}))
    }

    render() {
        const content = (
            <div>
                <div className="row">
                    <AddContact />
                </div>
                <div className="row">
                    { this.state.contacts.map((item) => (
                        <SingleContact key={item.id} item={item} />
                    ))}
                </div>
            </div>
        )
        return content;
    }
}