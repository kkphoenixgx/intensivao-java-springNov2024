package com.kkphoenix.dsList.dto;

import com.kkphoenix.dsList.entities.Game;

public class GameMinDTO {
  
  private Long id;
  
  private String title;
  private Integer year;
  private String shortDescription;
  private String imgUrl;

  // ----------- Constructors -----------

  public GameMinDTO(){}

  public GameMinDTO(Game entity) {
    this.id = entity.getId();
    this.title = entity.getTitle();
    this.year = entity.getYear();
    this.shortDescription = entity.getShortDescription();
    this.imgUrl = entity.getImgUrl();
  }

  // ----------- Getters and Setters -----------

  public Long getId() {
    return this.id;
  }
  public String getTitle() {
    return this.title;
  }
  public Integer getYear() {
    return this.year;
  }
  public String getShortDescription() {
    return this.shortDescription;
  }
  public String getImgUrl() {
    return this.imgUrl;
  }

}

