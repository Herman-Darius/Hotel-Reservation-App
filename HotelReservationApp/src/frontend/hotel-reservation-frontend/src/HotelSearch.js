import React, { useState, useEffect} from 'react';
import axios from 'axios'

const HotelSearch = () => {
    const [latitude, setLatitude] = useState('');
    const [longitute, setLongitude] = useState('');
    const [radius, setRadius] = useState('');
    const [hotels, setHotels] = useState([]);

    const searchHotels = () => {
        axios.get(`/api/hotels?latitude=${latitude}&longitude=${longitude}&radius=${radius}`)
            .then(response => setHotels(response.data))
            .catch(error => console.error('Eroare la hotele: ', error));
    };

    return (
        <div>
            <h1>Search Hotels</h1>
            <input type="text" placeholder="Latitude" value={latitude} onChange={e => setLatitude(e.target.value)}/>
            <input type="text" placeholder="Longitude" value={longitude} onChange={e => setLongitude(e.target.value)}/>
            <input type="text" placeholder="Radius (km)" value={radius} onChange={e => setRadius(e.target.value)}/>
            <button onClick={searchHotels}> Search</button>
            <u1>
                {hotels.map(hotel => (
                    <li key = {hotel.id}>
                        {hotel.name}
                    </li>
                ))}
            </u1>
        </div>
    );
};

export default HotelSearch;