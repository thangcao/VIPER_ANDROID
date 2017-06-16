package triangle.thangcao.com.viper_android.home.playpoker.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import triangle.thangcao.com.viper_android.R;
import triangle.thangcao.com.viper_android.enity.Poker;
import triangle.thangcao.com.viper_android.home.playpoker.PlayPokerContracts;
import triangle.thangcao.com.viper_android.home.playpoker.presenter.PlayPokerPresenter;

public class PlayPokerFragment extends Fragment implements PlayPokerContracts.View {

    private RecyclerView recyclerView;
    private TextView noData;
    private PokerAdapter pokerAdapter;
    private PlayPokerContracts.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_play_pocker, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUpAdapter();
        noData = (TextView) getView().findViewById(R.id.text_no_data);
        presenter = new PlayPokerPresenter(this, getActivity());
        presenter.loadPokers();
    }

    private void setUpAdapter() {
        pokerAdapter = new PokerAdapter(getContext());
        recyclerView = (RecyclerView) getView().findViewById(R.id.poker_recyclerview);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pokerAdapter);
    }

    @Override
    public void showListPokers(List<Poker> pokers) {
        pokerAdapter.addPokers(pokers);
        noData.setVisibility(View.GONE);
    }

    @Override
    public void showNoContent() {
        noData.setVisibility(View.VISIBLE);
    }

}
