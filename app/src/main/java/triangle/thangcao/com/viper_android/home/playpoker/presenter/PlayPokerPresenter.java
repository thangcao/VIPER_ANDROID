package triangle.thangcao.com.viper_android.home.playpoker.presenter;


import android.app.Activity;

import java.util.List;

import triangle.thangcao.com.viper_android.enity.Poker;
import triangle.thangcao.com.viper_android.home.playpoker.PlayPokerContracts;
import triangle.thangcao.com.viper_android.home.playpoker.interactor.PlayPokerInteractor;
import triangle.thangcao.com.viper_android.home.playpoker.router.PlayPokerRouter;

public class PlayPokerPresenter implements PlayPokerContracts.Presenter, PlayPokerContracts.InteractorOutput {

    private PlayPokerContracts.View view;
    private PlayPokerContracts.Interactor interactor;
    private PlayPokerContracts.Router router ;

    public PlayPokerPresenter(PlayPokerContracts.View view, Activity activity) {
        this.view = view;
        this.interactor = new PlayPokerInteractor(this);
        this.router = new PlayPokerRouter(activity);
    }

    @Override
    public void loadPokers() {
        interactor.fetchPokers();
    }

    @Override
    public void showDetail(Poker poker) {
        router.goToDetailScreen(poker);
    }

    @Override
    public void pokersFetched(List<Poker> pokers) {
        if (pokers.isEmpty()){
            view.showNoContent();
        } else {
            view.showListPokers(pokers);
        }
    }
}
