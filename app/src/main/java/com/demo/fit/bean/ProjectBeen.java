package com.demo.fit.bean;

import java.io.Serializable;

public class ProjectBeen implements Serializable {
   private String image;
   private String title;
   private String content;

   public String getImage() {
      return image;
   }

   public void setImage(String image) {
      this.image = image;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }
}
