package triangle.thangcao.com.viper_android.home.playpoker.interactor;

import java.util.ArrayList;
import java.util.List;

import triangle.thangcao.com.viper_android.enity.Poker;
import triangle.thangcao.com.viper_android.home.playpoker.PlayPokerContracts;

public class PlayPokerInteractor implements PlayPokerContracts.Interactor {

    private PlayPokerContracts.InteractorOutput interactorOutput;

    public PlayPokerInteractor(PlayPokerContracts.InteractorOutput interactorOutput) {
        this.interactorOutput = interactorOutput;
    }

    @Override
    public void fetchPokers() {
        // TODO: Fetch data in api
        List<Poker> pokers = new ArrayList<>();
        pokers.add(new Poker("A", "Value A"));
        pokers.add(new Poker("B", "Value B"));
        pokers.add(new Poker("C", "Value C"));
        pokers.add(new Poker("D", "Value D"));
        pokers.add(new Poker("E", "Value E"));

        interactorOutput.pokersFetched(pokers);
    }
}
