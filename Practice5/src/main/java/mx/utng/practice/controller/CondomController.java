package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Condom;
import mx.utng.practice.model.Customer;
import mx.utng.practice.repository.CondomRepository;

@Named
@ViewScoped
public class CondomController {
	
	@Autowired
	private CondomRepository condomRepository;
	private Condom condom = new Condom();
   private List<Condom> condoms;
   private boolean editMode = false;
  
   
   @PostConstruct
	public void init(){
		setCondoms(condomRepository.finAll());
	}
	public void save(){
		condomRepository.save(condom);
		if(!editMode){
		 getCondoms().add(condom);
		}
		condom = new Condom();
		setEditMode(false);
		
		}
	
	public void delete(Condom condom){
		condomRepository.delete(condom);
		condoms.remove(condom);
	}
	
	public void update(Condom condom){
		setCondom(condom);
		setEditMode(true);
	}
	public void cancel(){
		condom = new Condom();
		setEditMode(false);
	}

	
	
	
	

	public Condom getCondom() {
		return condom;
	}


	public void setCondom(Condom condom) {
		this.condom = condom;
	}


	public CondomRepository getCondomRepository() {
		return condomRepository;
	}


	public void setCondomRepository(CondomRepository condomRepository) {
		this.condomRepository = condomRepository;
	}


	public List<Condom> getCondoms() {
		return condoms;
	}


	public void setCondoms(List<Condom> condoms) {
		this.condoms = condoms;
	}


	public boolean isEditMode() {
		return editMode;
	}


	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}

	
	
}
