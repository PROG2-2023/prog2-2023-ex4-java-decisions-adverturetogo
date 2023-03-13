package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;


public class FlightBooking {
    private String flightID;
    private String passengerFullName;

    public static final String TRIP_SOURCE = "Nanjing";
    public static final String SOURCE_AIRPORT = "Nanjing Lukou International Airport";
    public static final String TRIP_DESTINATION = "Oulu";
    public static final String DESTINATION_AIRPORT = "Oulu Airport";
    public static final String FLIGHT_COMPANY = "Flights-Of-Fancy";
    
    TripDestination tripDestination;
    TripSource tripSource;
    TripType tripType;
    Airport sourceAirport;
    Airport destinationAirport;
    int TripDate;
    private LocalDate departureDate;
    private LocalDate returningDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
   
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;

    private String ticketNumber;
    BookingClass bookingClass;
    
    public FlightBooking(String fullName, LocalDate departureDate, LocalDate returnDate, int children, int adults) {
        passengerFullName = fullName;
        this.departureDate = departureDate;
        this.returningDate = returnDate;
        childPassengers = children;
        adultPassengers = adults;
    }
    enum BookingClass{
        FIRST,BUSINESS,ECONOMY
    }
    enum TripSource{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }
    enum TripDestination{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }
    enum Airport{
        NANJING_LUKOU_INTERNATIONAL_AIRPORT,BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
        SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT,OULU_AIRPORT,HELSINKI_AIRPORT,
        PARIS_CHARLES_DE_GAULLE_AIRPORT
    }
    enum TripType{
        ONE_WAY,RETURN
    }
    public void setTripDestination(String tripSource , String tripDestination){
        switch(tripDestination){
        case "1":
        this.tripDestination=TripDestination.NANJING;
        this.destinationAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
        break;
        case "2":
        this.tripDestination=TripDestination.BEIJING;
        this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
        break;
        case "3":
        this.tripDestination=TripDestination.SHANGHAI;
        this.destinationAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
        break;
        case "4":
        this.tripDestination=TripDestination.OULU;
        this.destinationAirport=Airport.OULU_AIRPORT;
        break;
        case "5":
        this.tripDestination=TripDestination.HELSINKI;
        this.destinationAirport=Airport.HELSINKI_AIRPORT;
        break;
        case "6":
        this.tripDestination=TripDestination.PARIS;
        this.destinationAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
        break;
        default:
        System.out.println("You have no such tripDestination and you have no such desitinationAirport");
        break;
          }
}

    public void setTripDate(int tripDate) {
        this.TripDate = tripDate;
        }
    public int getTripDate() {
            return TripDate;
        }
        public void setTripSource(String tripSource){
            switch(tripSource){
            case "1":
            this.tripSource=TripSource.NANJING;
            this.sourceAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.tripSource=TripSource.BEIJING;
            this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.tripSource=TripSource.SHANGHAI;
            this.sourceAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
            break;
            case "4":
            this.tripSource=TripSource.OULU;
            this.sourceAirport=Airport.OULU_AIRPORT;
            break;
            case "5":
            this.tripSource=TripSource.HELSINKI;
            this.sourceAirport=Airport.HELSINKI_AIRPORT;
            break;
            case "6":
            this.tripSource=TripSource.PARIS;
            this.sourceAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
            break;
            default:
            System.out.println("You have no such tripsource and you have no such airport");
            break;
          }
    }
    public TripSource getTripSource(){
        return this.tripSource;
    }

    public String getTripDestination(){
        return TRIP_DESTINATION;
    }

    public String getFlightCompany (){
        return FLIGHT_COMPANY;
    }
    
    public void setPassengerFullName(String name){
        this.passengerFullName = name;
    }

    public String getPassengerFullName(){
        return passengerFullName;
    }

    public int getChildPassengers(){
        return childPassengers;
    }

    public int getAdultPassengers(){
        return adultPassengers;
    }

    public String setFlightID(String fullName) {
        return "FOF" + fullName.substring(1,4) + "IN";
    }
    public void setTripType(String tripType) {
        switch(tripType){
            case "1":
            this.tripType=TripType.ONE_WAY;
            break;
            case "2":
            this.tripType=TripType.RETURN;
            break;
            default:
            System.out.println("You have no such tripType");
            }
    }
    public TripType getTripType(){
        return this.tripType;
    }
    public void setSourceAirport(Airport sourceAirport){
        if(sourceAirport.equals(destinationAirport)){
          this.sourceAirport=sourceAirport;
        }else{
          throw new IllegalArgumentException("Source cannot be the same as destination.");
        }
        }
        public Airport getSourceAirport(){
          return sourceAirport;
        }
        
    public void setTripDestination(Airport destinationAirport){
        if(destinationAirport.equals(sourceAirport)){
          this.destinationAirport=destinationAirport;
        }else{
          throw new IllegalArgumentException("Destination cannot be the same as source.");
        }
        }
        public Airport getDestinatiAirport(){
          return destinationAirport;
        }
    public void setTicketNumber(String fullName) {
        this.ticketNumber = "FOFT" + fullName.substring(1,4).toUpperCase() + TRIP_SOURCE.substring(1,3).toUpperCase() 
        + TRIP_DESTINATION.substring(1,3).toUpperCase() 
        + "IN";
    }

    public String getTicketNumber(){
        return ticketNumber;
    }

    public void setTotalPassengers(int children, int adults) {
        totalPassengers = children + adults;
    }

    public int getTotalPassengers(){
        return totalPassengers;
    }

    public void setDepartingTicketPrice(int child, int adults){
        departingTicketPrice = (child * 300) + (adults * 550);
    }

    public double getDepartingTicketPrice(){
        return departingTicketPrice;
    }

    public void setReturnTicketPrice(int child, int adults){
        returnTicketPrice = (child * 250) + (adults * 450);
    }

    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }

    public void setTotalTicketPrice() {
        totalTicketPrice = departingTicketPrice + returnTicketPrice;
    }

    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public void setDepartureDate(LocalDate departure) {
        this.departureDate = departure;
    }

    public LocalDate getDepartureDate(){
        return departureDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returningDate = returnDate;
    }

    public LocalDate getReturnDate(){
        return returningDate;
    }

    public void setBookingClass(String bookingClass){
        switch(bookingClass){
            case "1":
            this.bookingClass=BookingClass.FIRST;
            break;
            case "2":
            this.bookingClass=BookingClass.BUSINESS;
            break;
            case "3":
            this.bookingClass=BookingClass.ECONOMY;
            break;
            default:
            System.out.println("You have no such bookingClass");
            break;
           }
    }
    public BookingClass getBookingClass()
    {
        return this.bookingClass;
    }
    public String toString() {
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        FLIGHT_COMPANY + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + TRIP_SOURCE + " to " + TRIP_DESTINATION + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " + returningDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;
    }


    
}

