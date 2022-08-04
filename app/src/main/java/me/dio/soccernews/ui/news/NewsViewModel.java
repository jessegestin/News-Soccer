package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de Notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviaria tem Desfalque Importante", "Descrição Teste 1"));
        news.add(new News("Ferroviaria tem Jogo no Sábado", "Descrição Teste 2"));
        news.add(new News("Copa do Mundo Feminina Está Terminando", "Descrição Teste 3"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}