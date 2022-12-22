/**
 * 
 */
package com.nttdata.webflux.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.webflux.models.Person;

import reactor.core.publisher.Flux;

/**
 * @author DURAN
 *
 */
@RestController
public class PersonListController {
	
	@GetMapping("/person-list-1")
	public Flux<Person> personList1() {
		Person p1 = new Person();
		p1.setFirstname("Serena");
		p1.setLastname("Williams");
		p1.setAge(39);
		Person p2 = new Person();
		p2.setFirstname("Simnoe");
		p2.setLastname("Biles");
		p2.setAge(24);
		Flux<Person> flux1 = Flux.just(p1);
		Flux<Person> flux2 = Flux.just(p2);
		Flux<Person> flux = Flux.merge(flux1, flux2);

		return flux; // Retornamos el elemento.
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {
		Person p3 = new Person();
		p3.setFirstname("Tom");
		p3.setLastname("Cruise");
		p3.setAge(59);
		Person p4 = new Person();
		p4.setFirstname("Denzel");
		p4.setLastname("Washington");
		p4.setAge(66);
		Flux<Person> flux3 = Flux.just(p3);
		Flux<Person> flux4 = Flux.just(p4);
		Flux<Person> flux = Flux.merge(flux3, flux4);
		
		return flux; // Retornamos el elemento.
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		Person p5 = new Person();
		p5.setFirstname("Michael");
		p5.setLastname("Jordan");
		p5.setAge(58);
		Person p6 = new Person();
		p6.setFirstname("Lebron");
		p6.setLastname("James");
		p6.setAge(36);
		Flux<Person> flux5 = Flux.just(p5);
		Flux<Person> flux6 = Flux.just(p6);
		Flux<Person> flux = Flux.merge(flux5, flux6);

		return flux; // Retornamos el elemento.
	}
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		Person p7 = new Person();
		p7.setFirstname("Scarlett");
		p7.setLastname("Johansson");
		p7.setAge(36);
		Person p8 = new Person();
		p8.setFirstname("Jennifer");
		p8.setLastname("Aniston");
		p8.setAge(52);
		Flux<Person> flux7 = Flux.just(p7);
		Flux<Person> flux8 = Flux.just(p8);
		Flux<Person> flux = Flux.merge(flux7, flux8);

		return flux; // Retornamos el elemento.
	}

}
