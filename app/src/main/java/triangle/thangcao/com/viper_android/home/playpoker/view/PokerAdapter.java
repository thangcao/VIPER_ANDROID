package triangle.thangcao.com.viper_android.home.playpoker.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import triangle.thangcao.com.viper_android.R;
import triangle.thangcao.com.viper_android.enity.Poker;


public class PokerAdapter extends RecyclerView.Adapter<PokerAdapter.MyViewHolder> {


    private Context context;
    private List<Poker> pokers;

    public PokerAdapter(Context context) {
        this.context = context;
        this.pokers = new ArrayList<>();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_poker, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Poker poker = pokers.get(position);
        holder.title.setText(poker.getName());
        holder.description.setText(poker.getDescription());
    }

    @Override
    public int getItemCount() {
        return pokers.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView description;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title_poker);
            description = (TextView) view.findViewById(R.id.description_poker);
        }
    }

    public void addPoker(Poker poker){
        if (pokers.isEmpty()){
            pokers = new ArrayList<>();
        }
        pokers.add(poker);
        notifyDataSetChanged();
    }

    public void addPokers(List<Poker> pokers){
        if (!this.pokers.isEmpty()) {
            this.pokers.clear();
        }
        this.pokers.addAll(pokers);
        notifyDataSetChanged();
    }




}
