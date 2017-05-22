import entities.*;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by denak on 22.05.2017.
 */
public class HardCodeDatabase {
    private ArrayList<City> cities;
    private ArrayList<Client> clients;
    private ArrayList<Country> countries;
    private ArrayList<Hotel> hotels;
    private ArrayList<Voucher> vouchers;

    public HardCodeDatabase(){
        countries = new ArrayList<Country>();
        clients = new ArrayList<Client>();
        cities = new ArrayList<City>();
        hotels = new ArrayList<Hotel>();
        vouchers = new ArrayList<Voucher>();

        countries.add(new Country(0,"Ukraine"));
        countries.add(new Country(1,"Poland"));

        cities.add(new City(0,"Lviv", countries.get(0)));
        cities.add(new City(1,"Kyiv", countries.get(0)));
        cities.add(new City(2,"Varshava", countries.get(1)));
        cities.add(new City(3,"Gdansk", countries.get(1)));

        clients.add(new Client(0,"Ivanov Ivan", "+380673939675"));
        clients.add(new Client(1,"Petrov Petro", "+380992057704"));

        hotels.add(new Hotel(0,"LvivHotel", cities.get(0), 4));
        hotels.add(new Hotel(1,"KyivHotel", cities.get(1), 5));
        hotels.add(new Hotel(2,"VarshavaHotel", cities.get(2), 5));
        hotels.add(new Hotel(3,"GdanskHotel", cities.get(3), 3));

        vouchers.add(new Voucher(0, clients.get(0), hotels.get(1), new Date(2017,10, 5)));
        vouchers.add(new Voucher(1, clients.get(1), hotels.get(2), new Date(2017,9, 10)));
    }


    public ArrayList<City> getCities() {
        return cities;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public ArrayList<Voucher> getVouchers() {
        return vouchers;
    }

    public void addCity(City city){
        cities.add(city);
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public void addCountry(Country country){
        countries.add(country);
    }

    public void addHotel(Hotel hotel){
        hotels.add(hotel);
    }

    public void addVoucher(Voucher voucher){
        vouchers.add(voucher);
    }

    public void deleteCity(City city){
        cities.remove(city);
    }

    public void deleteClient(Client client){
        clients.remove(client);
    }

    public void deletedCountry(Country country){
        countries.remove(country);
    }

    public void deleteHotel(Hotel hotel){
        hotels.remove(hotel);
    }

    public void deleteVoucher(Voucher voucher){
        vouchers.remove(voucher);
    }

    public void updateCity(City city){
        cities.remove(city.getId());
        cities.add(city.getId(), city);
    }

    public void updateClient(Client client){
        clients.remove(client.getId());
        clients.add(client.getId(), client);
    }

    public void updateCountry(Country country){
        countries.remove(country.getId());
        countries.add(country.getId(), country);
    }

    public void updateHotel(Hotel hotel){
        hotels.remove(hotel.getId());
        hotels.add(hotel.getId(), hotel);
    }

    public void updateVoucher(Voucher voucher){
        vouchers.remove(voucher.getId());
        vouchers.add(voucher.getId(), voucher);
    }

}
