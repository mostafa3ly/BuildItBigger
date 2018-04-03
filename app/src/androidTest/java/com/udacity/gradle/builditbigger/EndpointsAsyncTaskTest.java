package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertFalse;


/**
 * Created by mosta on 3/4/2018.
 */

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void testAsyncTask() throws Exception {
        String joke = new EndpointsAsyncTask().execute().get();
        assertFalse(joke.isEmpty());
    }

}