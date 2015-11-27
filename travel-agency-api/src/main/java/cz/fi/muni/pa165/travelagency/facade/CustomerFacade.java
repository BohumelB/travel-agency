package cz.fi.muni.pa165.travelagency.facade;

import cz.fi.muni.pa165.travelagency.dto.CustomerDTO;
import cz.fi.muni.pa165.travelagency.dto.TripDTO;
import java.util.Collection;

/**
 *
 * @author Michal Holic
 */
public interface CustomerFacade extends UserFacade {
    
    /**
     * Makes reservation for Customer
     * 
     * @param customerDTO - customer who is making the reservation
     * @param tripDTO - trip which customer wishes to reserve
     */
    long makeReservation(CustomerDTO customerDTO, TripDTO tripDTO);
    
    /**
     * Finds Customer by id
     * 
     * @param userId - id of a Customer to find
     * @return found Customer
     */
    CustomerDTO findCustomerById(Long userId);
    
    /**
     * Finds Customer by email
     * 
     * @param email - email of a Customer to find
     * @return found Customer
     */
    CustomerDTO findCustomerByEmail(String email);
    
    /**
     * Finds all Customers in the database
     * 
     * @return Collection of found customers
     */
    Collection<CustomerDTO> getAllCustomers();
}
