package connector;

import entities.*;
import hardCodeDatabase.HardCodeDatabase;

import java.util.ArrayList;

/**
 * Created by denak on 22.05.2017.
 */
public class DBConnector {
    private HardCodeDatabase database;

    public DBConnector(){
        database = new HardCodeDatabase();
    }

    public ArrayList<Client> getClients(){
        return database.getClients();
    }

    public ArrayList<City> getCities(){
        return database.getCities();
    }

    public ArrayList<Hotel> getHotels(){
        return database.getHotels();
    }

    public ArrayList<Country> getCountries(){
        return database.getCountries();
    }

    public ArrayList<Voucher> getVouchers(){
        return database.getVouchers();
    }

    public void deleteClient(Client client){
        database.deleteClient(client);
    }

    public void deleteCity(City city){
        database.deleteCity(city);
    }

    public void deleteHotel(Hotel hotel){
        database.deleteHotel(hotel);
    }

    public void deleteCountry(Country country){
        database.deletedCountry(country);
    }

    public void deleteVoucher(Voucher voucher){
        database.deleteVoucher(voucher);
    }

    public void updateClient(Client client){
        database.updateClient(client);
    }

    public void updateCity(City city){
        database.updateCity(city);
    }

    public void updateHotel(Hotel hotel){
        database.updateHotel(hotel);
    }

    public void updateCountry(Country country){
        database.updateCountry(country);
    }

    public void updateVoucher(Voucher voucher){
        database.updateVoucher(voucher);
    }

    public void insertClient(Client client){
        database.addClient(client);
    }

    public void insertCity(City city){
        database.addCity(city);
    }

    public void insertHotel(Hotel hotel){
        database.addHotel(hotel);
    }

    public void insertCountry(Country country){
        database.addCountry(country);
    }

    public void insertVoucher(Voucher voucher){
        database.addVoucher(voucher);
    }
    
}
