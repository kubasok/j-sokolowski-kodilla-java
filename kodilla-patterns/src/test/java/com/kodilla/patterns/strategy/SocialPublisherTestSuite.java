package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class SocialPublisherTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        User millenial = new Millenial("Jacob");
        User yGenerationer = new YGeneration("John");
        User zGenerationer = new ZGeneration("Mike");
        String testFacebookPost = millenial.sharePost();
        String testTwitterPost = yGenerationer.sharePost();
        String testSnapchatPost = zGenerationer.sharePost();
        Assert.assertEquals("Sharing on Facebook",testFacebookPost);
        Assert.assertEquals("Sharing on Twitter",testTwitterPost);
        Assert.assertEquals("Sharing on Snapchat",testSnapchatPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        User snapMillenial = new Millenial("Jacob");
        snapMillenial.setSocialPublisher(new SnapchatPublisher());
        String testSnapchatPost = snapMillenial.sharePost();
        Assert.assertEquals("Sharing on Snapchat",testSnapchatPost);

    }
}
