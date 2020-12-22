package com;

import android.content.Context;
import android.view.LayoutInflater;

import androidx.recyclerview.widget.RecyclerView;

import com.example.roomsederhana.R;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    class WordViewHolder exstens RecycleView.WordViewHolder {
    private WordViewModel extends RecyclerView.ViewHolder;

    private WordViewHolder(View itemView) {
        super (itemView);
        wordItemView = itemView.findViewById(R.id.textView);
        }
    }
    private final LayoutInflater mInflater;
    private List<Word> mWords;

    WordListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public WordViewModel onCreateViewHolder(viewGroup parent, int viewType) {
        return new WordViewModel(itemView);

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        if (mWords != null) {
            Word current = mWords.get(position);
    @Override
    public void onBindViewHolder(WordViewHolder holder, int position){
                if (mWords != null) {
                    Word current = mWords.get(position);
                    holder.wordItemView.setText(current.getWord());
                } else {
                    holder.wordItemView.setText("No Word");
                }
            }
    void setWords(List(Word) Word) {
        mWords = Word;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mWords ! - null)
            return mWords.size();
        else return 0;
    }
        }
        }

    }
}
