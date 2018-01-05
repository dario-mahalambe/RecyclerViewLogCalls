package dario.mahalambe.recyclerviewlogcalls.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import dario.mahalambe.recyclerviewlogcalls.R;

/**
 * Created by Dario Mahalambe on 04/01/2018.
 */

public class CallLogViewHolder extends RecyclerView.ViewHolder{

    TextView mTextViewName;

    TextView mTextViewTime;

    ImageView mImageViewLetter;

    TextView mTextViewMobileCommunication;

    public CallLogViewHolder(View itemView) {
        super(itemView);

        mTextViewName = itemView.findViewById(R.id.tv_name);

        mTextViewTime = itemView.findViewById(R.id.tv_time_call);

        mTextViewMobileCommunication = itemView.findViewById(R.id.tv_mobile_communication);

        mImageViewLetter = itemView.findViewById(R.id.iv_letter);

    }
}