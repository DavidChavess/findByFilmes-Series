package com.davidchavess.findByFilmesSeries.dto;

import java.io.Serializable;

import com.davidchavess.findByFilmesSeries.entidades.Categoria;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoSerie;

public class ProducaoSerieDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String  titulo;
	private Integer anoLancamento;
	private Categoria categoria;
	private Integer duracao;
	private String caminhoImg;
	private Integer numeroTemporadas;
	private Integer episodiosPorTemporada;
	private Float notaMedia;

	public ProducaoSerieDto(){}	
	
	public ProducaoSerieDto(ProducaoSerie p) {
		id = p.getId(); 
		titulo = p.getTitulo();
		anoLancamento = p.getAnoLancamento();
		duracao = p.getDuracao(); 
		categoria = p.getCategoria();
		caminhoImg = p.getCaminhoImg();
		numeroTemporadas = p.getNumeroTemporadas();
		episodiosPorTemporada = p.getEpisodiosPorTemporada();	
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

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public String getCaminhoImg() {
		return caminhoImg;
	}

	public void setCaminhoImg(String caminhoImg) {
		this.caminhoImg = caminhoImg;
	}

	public Integer getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(Integer numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public Integer getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}

	public void setEpisodiosPorTemporada(Integer episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}

	public Float getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(Float notaMedia) {
		this.notaMedia = notaMedia;
	}

}
