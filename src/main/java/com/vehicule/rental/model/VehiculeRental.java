package com.vehicule.rental.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class VehiculeRental implements java.io.Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Basic(optional = false)
    @Column(nullable = false, name = "id_client")
    private int idClient;

    @Basic(optional = false)
    @Column(nullable = false, name = "id_vehicule")
    private int idVehicule;

    @Basic(optional = false)
    @Column(nullable = false, name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Basic(optional = false)
    @Column(nullable = false, name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Basic(optional = false)
    @Column(nullable = false, name = "price")
    private int price;

    @Basic(optional = false)
    @Column(nullable = false, name = "estimate_km")
    private int estimateKm;

    @Basic(optional = false)
    @Column(nullable = false, name = "closure")
    private boolean closure;

    @Basic(optional = false)
    @Column(nullable = false, name = "closure_date")
    @Temporal(TemporalType.DATE)
    private Date closureDate;

    @Basic(optional = false)
    @Column(nullable = false, name = "first_name")
    private String firstName;

    @Basic(optional = false)
    @Column(nullable = false, name = "last_name")
    private String lastName;

    @Basic(optional = false)
    @Column(nullable = false, name = "postal")
    private String postal;

    @Basic(optional = false)
    @Column(nullable = false, name = "mail")
    private String mail;

    @Basic(optional = false)
    @Column(nullable = false, name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Basic(optional = false)
    @Column(nullable = false, name = "nb_reservations")
    private int nbReservations;

    @Basic(optional = false)
    @Column(nullable = false, name = "nb_parrains")
    private int nbParrains;

    @Basic(optional = false)
    @Column(nullable = false, name = "paid_rental")
    private int paidRental;

    @Basic(optional = false)
    @Column(nullable = false, name = "name")
    private String name;

    @Basic(optional = false)
    @Column(nullable = false, name = "type")
    private String type;

    @Basic(optional = false)
    @Column(nullable = false, name = "km")
    private int km;

    @Basic(optional = false)
    @Column(nullable = false, name = "available")
    private boolean available;

    @Basic(optional = false)
    @Column(nullable = false, name = "cout_km")
    private int coutKm;

    public VehiculeRental() {
    }

    public VehiculeRental(int idClient, int idVehicule, Date startDate, Date endDate, int price, int estimateKm, boolean closure, Date closureDate, String firstName, String lastName, String postal, String mail, Date dateOfBirth, int nbReservations, int nbParrains, int paidRental, String name, String type, int km, boolean available, int coutKm) {
        this.idClient = idClient;
        this.idVehicule = idVehicule;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.estimateKm = estimateKm;
        this.closure = closure;
        this.closureDate = closureDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.postal = postal;
        this.mail = mail;
        this.dateOfBirth = dateOfBirth;
        this.nbReservations = nbReservations;
        this.nbParrains = nbParrains;
        this.paidRental = paidRental;
        this.name = name;
        this.type = type;
        this.km = km;
        this.available = available;
        this.coutKm = coutKm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEstimateKm() {
        return estimateKm;
    }

    public void setEstimateKm(int estimateKm) {
        this.estimateKm = estimateKm;
    }

    public boolean isClosure() {
        return closure;
    }

    public void setClosure(boolean closure) {
        this.closure = closure;
    }

    public Date getClosureDate() {
        return closureDate;
    }

    public void setClosureDate(Date closureDate) {
        this.closureDate = closureDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getNbReservations() {
        return nbReservations;
    }

    public void setNbReservations(int nbReservations) {
        this.nbReservations = nbReservations;
    }

    public int getNbParrains() {
        return nbParrains;
    }

    public void setNbParrains(int nbParrains) {
        this.nbParrains = nbParrains;
    }

    public int getPaidRental() {
        return paidRental;
    }

    public void setPaidRental(int paidRental) {
        this.paidRental = paidRental;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getCoutKm() {
        return coutKm;
    }

    public void setCoutKm(int coutKm) {
        this.coutKm = coutKm;
    }

    @Override
    public String toString() {
        return "VehiculeRental{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", idVehicule=" + idVehicule +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", price=" + price +
                ", estimateKm=" + estimateKm +
                ", closure=" + closure +
                ", closureDate=" + closureDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", postal='" + postal + '\'' +
                ", mail='" + mail + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nbReservations=" + nbReservations +
                ", nbParrains=" + nbParrains +
                ", paidRental=" + paidRental +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", km=" + km +
                ", available=" + available +
                ", coutKm=" + coutKm +
                '}';
    }
}
