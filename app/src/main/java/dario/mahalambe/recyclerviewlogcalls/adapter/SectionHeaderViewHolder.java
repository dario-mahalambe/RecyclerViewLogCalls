package dario.mahalambe.recyclerviewlogcalls.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import dario.mahalambe.recyclerviewlogcalls.R;

/**
 * Created by Dario Mahalambe on 04/01/2018.
 */

public class SectionHeaderViewHolder extends RecyclerView.ViewHolder {

    TextView mTextViewSectionTitle;

    public SectionHeaderViewHolder(View itemView) {
        super(itemView);

        mTextViewSectionTitle = itemView.findViewById(R.id.tv_section_title);
    }
}
