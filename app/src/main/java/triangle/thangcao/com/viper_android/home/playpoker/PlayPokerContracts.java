package triangle.thangcao.com.viper_android.home.playpoker;

import java.util.List;

import triangle.thangcao.com.viper_android.enity.Poker;

public class PlayPokerContracts {

    public interface View {
        void showListPokers(List<Poker> pokers);
        void showNoContent();
    }

    public interface Presenter {
        void loadPokers();
        void showDetail(Poker poker);
    }

    public interface InteractorOutput {
        void pokersFetched(List<Poker> pokers);
    }

    public interface Interactor {
        void fetchPokers();
    }

    public interface Router {
        void goToDetailScreen(Poker poker);
    }



}
