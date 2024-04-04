package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.math.BigInteger;

import org.mockito.MockedStatic;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.ECFieldElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

public class LazyECPointSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ECCurve curveMock = mock(ECCurve.class, "curve");

    private final ECFieldElement eCFieldElementMock = mock(ECFieldElement.class);

    private final ECPoint eCPointMock = mock(ECPoint.class);

    private final ECPoint eCPointMock2 = mock(ECPoint.class);

    private final ECPoint eCPointMock3 = mock(ECPoint.class);

    //Sapient generated method id: ${4e9c8ce1-7355-3002-8426-1f382a161439}, hash: 5CD22E8EABE4D2730FC7348B8FF2211E
    @Test()
    public void compressWhenCompressed() {
        /* Branches:
         * (compressed) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
            LazyECPoint target = new LazyECPoint(curveMock, byteArray);
            //Act Statement(s)
            LazyECPoint result = target.compress();
            //Assert statement(s)
            assertThat(result, equalTo(target));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${9c0a3954-18ec-314e-ab25-0494ae3cc18e}, hash: C8F3D6ACA6A7E2933E45E6A24CE5C8A2
    @Test()
    public void compressWhenNotCompressed() {
        /* Branches:
         * (compressed) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).normalize();
            //Act Statement(s)
            LazyECPoint result = target.compress();
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, true);
            //Assert statement(s)
            assertThat(result, equalTo(lazyECPoint));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock, atLeast(1)).normalize();
        }
    }

    //Sapient generated method id: ${dce0e767-b387-3291-9e89-521afeda9393}, hash: DC6D30645318DD547D4D06C8D0F68BD3
    @Test()
    public void decompressWhenNotCompressed() {
        /* Branches:
         * (!compressed) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = new LazyECPoint(curveMock, byteArray);
            //Act Statement(s)
            LazyECPoint result = target.decompress();
            //Assert statement(s)
            assertThat(result, equalTo(target));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${a20c80a8-c85d-3813-b4f0-0c6ff7cbf090}, hash: A546E28C1A453C32265721D1F68B9D59
    @Test()
    public void decompressWhenCompressed() {
        /* Branches:
         * (!compressed) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).normalize();
            //Act Statement(s)
            LazyECPoint result = target.decompress();
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(lazyECPoint));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock, atLeast(1)).normalize();
        }
    }

    //Sapient generated method id: ${0b3e2cb2-b90a-35e3-ad3b-d5fa478b50a9}, hash: E4D9DDC8447DB45EE108FE09C4EB156E
    @Test()
    public void getWhenPointIsNull() {
        /* Branches:
         * (point == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = new LazyECPoint(curveMock, byteArray);
            doReturn(eCPointMock).when(curveMock).decodePoint(byteArray);
            //Act Statement(s)
            ECPoint result = target.get();
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(curveMock).decodePoint(byteArray);
        }
    }

    //Sapient generated method id: ${cf6fe54d-feda-3f5c-85e0-08a4ab2786ff}, hash: 17E95B00401FF3326B2C13DDFC5D5563
    @Test()
    public void getEncodedWhenBitsIsNotNull() {
        /* Branches:
         * (bits != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = new LazyECPoint(curveMock, byteArray);
            //Act Statement(s)
            byte[] result = target.getEncoded();
            //Assert statement(s)
            assertThat(result.length, equalTo(0));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${243ea24e-c685-3c28-8d5d-82036e32e36f}, hash: CB0E9BFC02F9AB0D9B6BD63ACAB3A7FC
    @Test()
    public void getEncodedWhenBitsIsNull() {
        /* Branches:
         * (bits != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            eCKey.when(() -> ECKey.isPubKeyCompressed((byte[]) null)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, (byte[]) null));
            doReturn(eCPointMock).when(target).get();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCPointMock).getEncoded(false);
            //Act Statement(s)
            byte[] result = target.getEncoded();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            eCKey.verify(() -> ECKey.isPubKeyCompressed((byte[]) null), atLeast(1));
            verify(target).get();
            verify(eCPointMock).getEncoded(false);
        }
    }

    //Sapient generated method id: ${ec093c29-77ad-310d-9eb2-a17f82051d55}, hash: A4573429846C58F0FDFFE113A6FEFDF9
    @Test()
    public void getDetachedPointTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).getDetachedPoint();
            //Act Statement(s)
            ECPoint result = target.getDetachedPoint();
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).getDetachedPoint();
        }
    }

    //Sapient generated method id: ${869e5444-dcbf-37b2-948f-976c22592f57}, hash: 6478ED8FCE90F595988EA3C1BDA925FE
    @Test()
    public void isInfinityWhenGetIsInfinity() {
        /* Branches:
         * (get().isInfinity()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(true).when(eCPointMock).isInfinity();
            //Act Statement(s)
            boolean result = target.isInfinity();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).isInfinity();
        }
    }

    //Sapient generated method id: ${8021a96c-6ae1-35ac-9356-46b6091cbcda}, hash: CCC7590D2C428E4A675C8E0A086C2774
    @Test()
    public void isInfinityWhenGetNotIsInfinity() {
        /* Branches:
         * (get().isInfinity()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(false).when(eCPointMock).isInfinity();
            //Act Statement(s)
            boolean result = target.isInfinity();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).isInfinity();
        }
    }

    //Sapient generated method id: ${fb6b4d1c-d7ef-38fa-9b44-19302eb6320b}, hash: EF1C78E597D6FDAAE2E4289FC7028FAA
    @Test()
    public void timesPow2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).timesPow2(0);
            //Act Statement(s)
            ECPoint result = target.timesPow2(0);
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).timesPow2(0);
        }
    }

    //Sapient generated method id: ${6558fc31-f297-3cd3-9a02-5b320f5c50be}, hash: 9BD689A8436AB85578F6A608B66739CB
    @Test()
    public void getYCoordTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCFieldElementMock).when(eCPointMock).getYCoord();
            //Act Statement(s)
            ECFieldElement result = target.getYCoord();
            //Assert statement(s)
            assertThat(result, equalTo(eCFieldElementMock));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).getYCoord();
        }
    }

    //Sapient generated method id: ${49afa737-d2d7-328e-a908-89094c52b7c2}, hash: C95C55E40B6D2AE89F6CCF8BE3911C29
    @Test()
    public void getZCoordsTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            ECFieldElement[] eCFieldElementArray = new ECFieldElement[]{};
            doReturn(eCFieldElementArray).when(eCPointMock).getZCoords();
            //Act Statement(s)
            ECFieldElement[] result = target.getZCoords();
            //Assert statement(s)
            assertThat(result, equalTo(eCFieldElementArray));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).getZCoords();
        }
    }

    //Sapient generated method id: ${f655aeca-2a08-3b24-b7cc-2a929568754b}, hash: 82ABAE6527595B16A7A86B71C1230F55
    @Test()
    public void isNormalizedWhenGetIsNormalized() {
        /* Branches:
         * (get().isNormalized()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(true).when(eCPointMock).isNormalized();
            //Act Statement(s)
            boolean result = target.isNormalized();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).isNormalized();
        }
    }

    //Sapient generated method id: ${399c726a-5663-3f08-b3e8-d806f401c21b}, hash: 699AF5F953013CA117FF45577D3B42B0
    @Test()
    public void isNormalizedWhenGetNotIsNormalized() {
        /* Branches:
         * (get().isNormalized()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(false).when(eCPointMock).isNormalized();
            //Act Statement(s)
            boolean result = target.isNormalized();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).isNormalized();
        }
    }

    //Sapient generated method id: ${f2e2be9f-c5d7-3010-98aa-6831b8f18beb}, hash: 566B9399484989EA84087471DB18C8E1
    @Test()
    public void multiplyTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).multiply(new BigInteger("0"));
            //Act Statement(s)
            ECPoint result = target.multiply(new BigInteger("0"));
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).multiply(new BigInteger("0"));
        }
    }

    //Sapient generated method id: ${97b5e3b9-042a-36e9-ba00-8365659a5608}, hash: D0934CB73BD4B07A103215CF73A84A87
    @Test()
    public void subtractTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).subtract(eCPointMock3);
            //Act Statement(s)
            ECPoint result = target.subtract(eCPointMock3);
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).subtract(eCPointMock3);
        }
    }

    //Sapient generated method id: ${0d94c6c3-3da3-39d9-a702-e44ed362e6fe}, hash: F58276C0CD8B64F8B5F4675E4C52CCB9
    @Test()
    public void isValidWhenGetIsValid() {
        /* Branches:
         * (get().isValid()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(true).when(eCPointMock).isValid();
            //Act Statement(s)
            boolean result = target.isValid();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).isValid();
        }
    }

    //Sapient generated method id: ${75cfa43f-4b3d-3c28-8ae3-16f3fb07c04d}, hash: A875033CD36AC5CBF96EFB1B0DAB3662
    @Test()
    public void isValidWhenGetNotIsValid() {
        /* Branches:
         * (get().isValid()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(false).when(eCPointMock).isValid();
            //Act Statement(s)
            boolean result = target.isValid();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).isValid();
        }
    }

    //Sapient generated method id: ${3aa5318d-e14e-3d16-9a85-852b47f5735d}, hash: F1D1E02EC0000E17E7955C31B72B03BC
    @Test()
    public void scaleYTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).scaleY(eCFieldElementMock);
            //Act Statement(s)
            ECPoint result = target.scaleY(eCFieldElementMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).scaleY(eCFieldElementMock);
        }
    }

    //Sapient generated method id: ${dc0cbf17-5fe6-39b4-9cf3-8ca42085be8d}, hash: 664D2C96A96D7AB4BE11E60EF7A51D85
    @Test()
    public void getXCoordTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCFieldElementMock).when(eCPointMock).getXCoord();
            //Act Statement(s)
            ECFieldElement result = target.getXCoord();
            //Assert statement(s)
            assertThat(result, equalTo(eCFieldElementMock));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).getXCoord();
        }
    }

    //Sapient generated method id: ${a79665bf-1481-398a-9071-7417e564009f}, hash: B291A6293F1E1C61A0F8BE0783C2AD7C
    @Test()
    public void scaleXTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).scaleX(eCFieldElementMock);
            //Act Statement(s)
            ECPoint result = target.scaleX(eCFieldElementMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).scaleX(eCFieldElementMock);
        }
    }

    //Sapient generated method id: ${00610e8a-308a-3060-9272-e6226990d3e8}, hash: 760245116F222A30229E8C628A4360A3
    @Test()
    public void negateTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).negate();
            //Act Statement(s)
            ECPoint result = target.negate();
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).negate();
        }
    }

    //Sapient generated method id: ${af01baf5-859c-378e-8dd0-d42173ef03ee}, hash: 6F092C0650F999940FE5411268FADB92
    @Test()
    public void threeTimesTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).threeTimes();
            //Act Statement(s)
            ECPoint result = target.threeTimes();
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).threeTimes();
        }
    }

    //Sapient generated method id: ${abf61a24-83ad-3b61-9e1a-dc99b06e207f}, hash: 3F81847F439A00E4F379A131FE988FC2
    @Test()
    public void getZCoordTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCFieldElementMock).when(eCPointMock).getZCoord(0);
            //Act Statement(s)
            ECFieldElement result = target.getZCoord(0);
            //Assert statement(s)
            assertThat(result, equalTo(eCFieldElementMock));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).getZCoord(0);
        }
    }

    //Sapient generated method id: ${77f038b5-1865-3e33-a88c-2c57803f4614}, hash: 89D1816EBC7AD0D2DEB6540D23F2B793
    @Test()
    public void getEncoded1WhenBitsIsNotNull() {
        /* Branches:
         * (compressed == isCompressed()) : true
         * (bits != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(false).when(target).isCompressed();
            //Act Statement(s)
            byte[] result = target.getEncoded(false);
            //Assert statement(s)
            assertThat(result.length, equalTo(0));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).isCompressed();
        }
    }

    //Sapient generated method id: ${f3d0addc-49af-3531-8d64-aafbf9ec182b}, hash: 4EA35B68C073A93E63D490A4972928B2
    @Test()
    public void getEncoded1WhenBitsIsNull() {
        /* Branches:
         * (compressed == isCompressed()) : true
         * (bits != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            eCKey.when(() -> ECKey.isPubKeyCompressed((byte[]) null)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, (byte[]) null));
            doReturn(false).when(target).isCompressed();
            doReturn(eCPointMock).when(target).get();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCPointMock).getEncoded(false);
            //Act Statement(s)
            byte[] result = target.getEncoded(false);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            eCKey.verify(() -> ECKey.isPubKeyCompressed((byte[]) null), atLeast(1));
            verify(target).isCompressed();
            verify(target).get();
            verify(eCPointMock).getEncoded(false);
        }
    }

    //Sapient generated method id: ${2f52d914-224e-3cf8-a2e5-c61089a0f6f4}, hash: DBC531E977A6CAB547D335DB4866FEFF
    @Test()
    public void addTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).add(eCPointMock3);
            //Act Statement(s)
            ECPoint result = target.add(eCPointMock3);
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).add(eCPointMock3);
        }
    }

    //Sapient generated method id: ${215b2d25-1bd5-3ed3-a110-763528295d03}, hash: EC7C97718CDBB4C9379DAFEAC54257C8
    @Test()
    public void twicePlusTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).twicePlus(eCPointMock3);
            //Act Statement(s)
            ECPoint result = target.twicePlus(eCPointMock3);
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).twicePlus(eCPointMock3);
        }
    }

    //Sapient generated method id: ${eb47973f-4d50-34cd-adc9-d630876f3801}, hash: D2BF67D33CDFFFA18F844ADF340DB278
    @Test()
    public void getCurveTest() {
        //Arrange Statement(s)
        ECCurve eCCurveMock = mock(ECCurve.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCCurveMock).when(eCPointMock).getCurve();
            //Act Statement(s)
            ECCurve result = target.getCurve();
            //Assert statement(s)
            assertThat(result, equalTo(eCCurveMock));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).getCurve();
        }
    }

    //Sapient generated method id: ${fd84fbe7-beb0-315d-afd1-860bd41a9b7f}, hash: 2B8824A857D2DC81EA08360182980A31
    @Test()
    public void normalizeTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).normalize();
            //Act Statement(s)
            ECPoint result = target.normalize();
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).normalize();
        }
    }

    //Sapient generated method id: ${01740f11-0dda-3760-b445-66631166b4ec}, hash: A860F76B61AC411E94AC8E42A1805923
    @Test()
    public void getYTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).normalize();
            doReturn(eCFieldElementMock).when(eCPointMock).getYCoord();
            //Act Statement(s)
            ECFieldElement result = target.getY();
            //Assert statement(s)
            assertThat(result, equalTo(eCFieldElementMock));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).normalize();
            verify(eCPointMock).getYCoord();
        }
    }

    //Sapient generated method id: ${0d659186-8bb5-3c66-ab9d-e341cdcd9ed6}, hash: 3D490C164FD4B5ADB2C2D6A825B1896C
    @Test()
    public void twiceTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).twice();
            //Act Statement(s)
            ECPoint result = target.twice();
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).twice();
        }
    }

    //Sapient generated method id: ${3a7af79d-7d76-3ec2-94af-f9dab0a05761}, hash: 5B700C17D65CBF98DD89ED0257B048AB
    @Test()
    public void getAffineYCoordTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCFieldElementMock).when(eCPointMock).getAffineYCoord();
            //Act Statement(s)
            ECFieldElement result = target.getAffineYCoord();
            //Assert statement(s)
            assertThat(result, equalTo(eCFieldElementMock));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).getAffineYCoord();
        }
    }

    //Sapient generated method id: ${829eece6-438d-3fc4-9c7f-a40678792865}, hash: 8DF73F1B9F249C8E5745A7583A8EFB99
    @Test()
    public void getAffineXCoordTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCFieldElementMock).when(eCPointMock).getAffineXCoord();
            //Act Statement(s)
            ECFieldElement result = target.getAffineXCoord();
            //Assert statement(s)
            assertThat(result, equalTo(eCFieldElementMock));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).getAffineXCoord();
        }
    }

    //Sapient generated method id: ${2a257878-d67c-3b6b-a704-9e218a839d00}, hash: 16DC662D7945BE00098B22A5B20332DA
    @Test()
    public void getXTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).normalize();
            doReturn(eCFieldElementMock).when(eCPointMock).getXCoord();
            //Act Statement(s)
            ECFieldElement result = target.getX();
            //Assert statement(s)
            assertThat(result, equalTo(eCFieldElementMock));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).normalize();
            verify(eCPointMock).getXCoord();
        }
    }
}
