package br.com.exemplo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Aula implements Serializable {
  private static final long serialVersionUID = -6745032908099856302L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String titulo;
  @Temporal(TemporalType.DATE)
  private Date data;
  @OneToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name="aula_id")
  private List<Tarefa> tarefas;

  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public List<Tarefa> getTarefas() {
    return tarefas;
  }
  public void setTarefas(List<Tarefa> tarefas) {
    this.tarefas = tarefas;
  }
}