package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.protobuf.ByteString;

import java.util.Map;

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

    //Sapient generated method id: ${f8b7aca3-3153-3771-9263-68836570fafd}, hash: 408808357051F94BF9DA1D5214978DC7
    @Test()
    public void maybeGetTagTest() {
        //Arrange Statement(s)
        BaseTaggableObject target = new BaseTaggableObject();

        //Act Statement(s)
        ByteString result = target.maybeGetTag("tag1");

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${eb49f7dd-1107-36f8-9b75-dd367069f936}, hash: 8A50DE50F5ADADE2DC58D9D93E6C9CC4
    @Test()
    public void getTagWhenBIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (b == null) : true
         */
        //Arrange Statement(s)
        BaseTaggableObject target = new BaseTaggableObject();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown tag A");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());

        //Act Statement(s)
        target.getTag("A");
    }

    //Sapient generated method id: ${d92a6414-d18c-3f09-b483-a17a3c92b04b}, hash: 1AAE99EC1F4A7AD806897784D15154D4
    @Test()
    public void setTagTest() {
        //Arrange Statement(s)
        BaseTaggableObject target = new BaseTaggableObject();
        ByteString byteStringMock = mock(ByteString.class);

        //Act Statement(s)
        target.setTag("tag1", byteStringMock);
    }

    //Sapient generated method id: ${59fc8b6d-9cf4-385e-b4d4-3f0361c77781}, hash: 77545F98206FB5649F10AEBBC926FB07
    @Test()
    public void getTagsTest() {
        //Arrange Statement(s)
        BaseTaggableObject target = new BaseTaggableObject();

        //Act Statement(s)
        Map<String, ByteString> result = target.getTags();

        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }
}
