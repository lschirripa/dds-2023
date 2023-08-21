package behaviouralPatterns.observer;


import behaviouralPatterns.observer.Channel;
import lombok.Setter;

// 1 suscriptor en concreto
public class NewsChannel implements Channel {
  @Setter
  private String news;

  @Override
  public void update(Object news) {
    this.setNews((String) news);
  }

}