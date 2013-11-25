package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model {
	
private boolean concluido = false;

  @Id
  public Long id;
  
  @Required
  public String nome;
  
  @Required
  public String descricao;
  
  @Required
  public int prioridade;
  
  public boolean Concluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}
  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

public static Finder<Long,Task> find = new Finder(Long.class, Task.class);

  public static List<Task> all() {
	  return find.all();
	}

	public static void create(Task task) {
	  task.save();
	}

	public static void delete(Long id) {
	  find.ref(id).delete();
	}
	
	public static void update(Long id) {
		Task task = find.ref(id);
        if (task.Concluido() == true) {
        	task.setConcluido(false);
        } else{
        	task.setConcluido(true);
        }
        task.update();
	}

}
