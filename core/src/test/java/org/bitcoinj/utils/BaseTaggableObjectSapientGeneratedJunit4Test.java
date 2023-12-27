package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.protobuf.ByteString;

import java.util.Map;
import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class BaseTaggableObjectSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${f8b7aca3-3153-3771-9263-68836570fafd}
    @Test()
    public void maybeGetTagTest() {
        //Arrange Statement(s)
        BaseTaggableObject target = new BaseTaggableObject();

        //Act Statement(s)
        ByteString result = target.maybeGetTag("sampleTag");

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${eb49f7dd-1107-36f8-9b75-dd367069f936}
    @Test()
    public void getTagWhenBIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (b == null) : true
         */
        //Arrange Statement(s)
        BaseTaggableObject target = new BaseTaggableObject();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown tag unknown_tag");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());

        //Act Statement(s)
        target.getTag("unknown_tag");
    }

    //Sapient generated method id: ${d92a6414-d18c-3f09-b483-a17a3c92b04b}
    @Test()
    public void setTagTest() {
        //Arrange Statement(s)
        BaseTaggableObject target = new BaseTaggableObject();
        ByteString byteString = ByteString.empty();

        //Act Statement(s)
        target.setTag("sampleTag", byteString);
    }
}
