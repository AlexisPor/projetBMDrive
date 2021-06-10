package com.projetBMDrive.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetBMDrive.entities.TReservation;
import com.projetBMDrive.services.ReservationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("reservation")
public class ReservationRestController {

	@Autowired
	private ReservationService reservationService;

	/**
	 * Ajout d'une réservation.
	 * @param res
	 */
	@PostMapping("/resMap")
	public void add(@RequestBody TReservation res) {

		reservationService.add(res);
	}

	/**
	 * Afficher la liste des réservations.
	 * @return
	 */
	@GetMapping("/resMap")
	public List<TReservation> findAll() {

		return reservationService.findAll();
	}

	/**
	 * Chercher une réservation par son id.	 
	 * @param resIdReservation
	 * @return
	 */
	@GetMapping("/resMap/{resIdReservation}")
	public TReservation findById(@PathVariable BigDecimal resIdReservation) {
		return reservationService.findById(resIdReservation);
	}

	/**
	 * Supprimer une réservation.
	 * @param resIdReservation
	 * @param res
	 */
	@DeleteMapping("/resMap/{resIdReservation}")
	public void delete(@PathVariable BigDecimal resIdReservation, TReservation res) {

		reservationService.delete(res);
	}

	/**
	 * Modifier les infos d'une réservation.
	 * @param res
	 */
	@PutMapping("/resMap/{resIdReservation}")
	public void updateReservation(@RequestBody TReservation res) {

		reservationService.update(res);
		
	}

}
