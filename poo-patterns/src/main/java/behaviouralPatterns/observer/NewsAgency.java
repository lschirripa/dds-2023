package behaviouralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

//observable
//notificador
// cuando cambia el estado notifica a los observadores
public class NewsAgency {
  private String news;
  private List<Channel> channels = new ArrayList<>();

  public void addObserver(Channel channel) {
    this.channels.add(channel);
  }

  public void removeObserver(Channel channel) {
    this.channels.remove(channel);
  }

  // aca los notifica, desacopladamente sin saber quienes son sus suscriptores
  // solo sabe que son de tipo Channel y que tienen el metodo update

  public void setNews(String news) {
    this.news = news;
    for (Channel channel : this.channels) {
      channel.update(this.news);
    }
  }
}