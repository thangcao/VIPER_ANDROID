package triangle.thangcao.com.viper_android.home.playpoker.router;

import android.app.Activity;

import triangle.thangcao.com.viper_android.enity.Poker;
import triangle.thangcao.com.viper_android.home.playpoker.PlayPokerContracts;


public class PlayPokerRouter implements PlayPokerContracts.Router {

    private Activity activity;

    public PlayPokerRouter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void goToDetailScreen(Poker poker) {
        // TODO: Prepare Intent and go to PokerDetail

    }
}
