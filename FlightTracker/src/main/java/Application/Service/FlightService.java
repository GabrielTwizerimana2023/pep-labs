package Application.Service;

import Application.Model.Flight;
import Application.Util.ConnectionUtil;
import Application.DAO.FlightDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of a Service class is to contain "business logic" that sits between the web layer (controller) and
 * persistence layer (DAO). That means that the Service class performs tasks that aren't done through the web or
 * SQL: programming tasks like checking that the input is valid, conducting additional security checks, or saving the
 * actions undertaken by the API to a logging file.
 *
 * It's perfectly normal to have Service methods that only contain a single line that calls a DAO method. An
 * application that follows best practices will often have unnecessary code, but this makes the code more
 * readable and maintainable in the long run!
 */
public class FlightService {
    FlightDAO flightDAO;

    /**
     * No-args constructor for a flightService instantiates a plain flightDAO.
     * There is no need to modify this constructor.
     */
    public FlightService(){
        flightDAO = new FlightDAO();
    }

    /**
     * Constructor for a flightService when a flightDAO is provided.
     * This is used for when a mock flightDAO that exhibits mock behavior is used in the test cases.
     * This would allow the testing of FlightService independently of FlightDAO.
     * There is no need to modify this constructor.
     * @param flightDAO
     */
    public FlightService(FlightDAO flightDAO){
        this.flightDAO = flightDAO;
    }

    /**
     * TODO: Use the FlightDAO to add a new flight to the database.
     *
     * @param flight an object representing a Flight.
     * @return the newly added flight if the add operation was successful, including the flight_id. We do this to
     *         inform our provide the front-end client with information about the added Flight.
     */
    public Flight addFlight(Flight flight){
        Connection connection = ConnectionUtil.getConnection();
        try {
            //Write SQL logic here. When inserting, you only need to define the departure_city and arrival_city
            //values (two columns total!)
            String sql = "insert into flight(departure_city,arrival_city) values (?,?);" ;
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            //write preparedStatement's setString and setInt methods here.
            preparedStatement.setString(1, flight.getDeparture_city());
            preparedStatement.setString(2, flight.getArrival_city());

            preparedStatement.executeUpdate();
            ResultSet pkeyResultSet = preparedStatement.getGeneratedKeys();
            if(pkeyResultSet.next()){
                int generated_flight_id = (int) pkeyResultSet.getLong(1);
                return new Flight(generated_flight_id, flight.getDeparture_city(), flight.getArrival_city());
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    /**
     * TODO: Use the FlightDAO to update an existing flight from the database.
     * You should first check that the flight ID already exists. To do this, you could use an if statement that checks
     * if flightDAO.getFlightById returns null for the flight's ID, as this would indicate that the flight id does not
     * exist.
     *
     * @param flight_id the ID of the flight to be modified.
     * @param flight an object containing all data that should replace the values contained by the existing flight_id.
     * @return the newly updated flight if the update operation was successful. Return null if the update operation was
     *         unsuccessful. We do this to inform our application about successful/unsuccessful operations. (eg, the
     *         user should have some insight if they attempted to edit a nonexistent flight.)
     */
    public Flight updateFlight(int flight_id, Flight flight){
        Connection connection = ConnectionUtil.getConnection();
        FlightDAO flightdao=new FlightDAO();
        try {
            //Write SQL logic here
            String sql = "update flight set departure_city=?,arrival_city=? where flight_id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, flight.getDeparture_city());
            preparedStatement.setString(2, flight.getArrival_city());
            preparedStatement.setInt(3, flight_id);
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * TODO: Use the FlightDAO to retrieve a List containing all flights.
     * You could use the flightDAO.getAllFlights method.
     *
     * @return all flights in the database.
     */
    public List<Flight> getAllFlights(){
        Connection connection = ConnectionUtil.getConnection();
        List<Flight> flights=new ArrayList<>();
        try {
            String sql="select * from flight;";
        PreparedStatement preparedstatement=connection.prepareStatement(sql);
        ResultSet rs=preparedstatement.executeQuery();
        while (rs.next()) {
            Flight flight = new Flight(rs.getInt("flight_id"), rs.getString("departure_city"),
                        rs.getString("arrival_city"));
                flights.add(flight);
        }
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        
        return flights;
    }

    /**
     * TODO: Use the FlightDAO to retrieve a List containing all flights departing from a certain city and arriving at
     * some other city. You could use the flightDAO.getAllFlightsFromCityToCity method.
     *
     * @param departure_city the departing city of the flight.
     * @param arrival_city the arriving city of the flight.
     * @return all flights departing from departure_city and arriving at arrival_city.
     */
    public List<Flight> getAllFlightsFromCityToCity(String departure_city, String arrival_city) {
        Connection connection = ConnectionUtil.getConnection();
        List<Flight> flights = new ArrayList<>();
        try {
            String sql = "select * from flight where departure_city=? and arrival_city=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            //write PreparedStatement setString and setInt methods here.
            preparedStatement.setString(1,departure_city);
            preparedStatement.setString(2, arrival_city);

            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Flight flight = new Flight(rs.getInt("flight_id"), rs.getString("departure_city"),
                        rs.getString("arrival_city"));
                flights.add(flight);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return flights;
    }
}
