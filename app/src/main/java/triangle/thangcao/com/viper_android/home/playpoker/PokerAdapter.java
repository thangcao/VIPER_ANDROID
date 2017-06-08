package triangle.thangcao.com.viper_android.home.playpoker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import triangle.thangcao.com.viper_android.R;
import triangle.thangcao.com.viper_android.enity.Poker;


public class PokerAdapter extends RecyclerView.Adapter<PokerAdapter.MyViewHolder> {


    private Context context;
    private List<Poker> pokers;

    public PokerAdapter(Context context, List<Poker> pokers) {
        this.pokers = pokers;
        this.context = context;
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
}
