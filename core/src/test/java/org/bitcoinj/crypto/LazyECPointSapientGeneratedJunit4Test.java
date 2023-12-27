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

import org.junit.Ignore;

public class LazyECPointSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ECCurve curveMock = mock(ECCurve.class, "<value of curve>");

    private final ECFieldElement eCFieldElementMock = mock(ECFieldElement.class, "UnknownObjectContent{target='org.bouncycastle.math.ec.ECFieldElement', onlyPojoFunctions=false, builderPattern=false}");

    private final ECPoint eCPointMock = mock(ECPoint.class);

    private final ECPoint eCPointMock2 = mock(ECPoint.class, "UnknownObjectContent{target='org.bouncycastle.math.ec.ECPoint', onlyPojoFunctions=false, builderPattern=false}");

    private final ECPoint eCPointMock3 = mock(ECPoint.class, "{}");

    //Sapient generated method id: ${4e9c8ce1-7355-3002-8426-1f382a161439}
    @Test()
    public void compressWhenCompressed() {
        /* Branches:
         * (compressed) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock2 = mock(ECPoint.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
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
            verify(eCPointMock).normalize();
        }
    }

    //Sapient generated method id: ${9c0a3954-18ec-314e-ab25-0494ae3cc18e}
    @Ignore()
    @Test()
    public void compressWhenNotCompressed() {
        /* Branches:
         * (compressed) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock2 = mock(ECPoint.class);
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
            verify(eCPointMock).normalize();
        }
    }

    //Sapient generated method id: ${dce0e767-b387-3291-9e89-521afeda9393}
    @Test()
    public void decompressWhenNotCompressed() {
        /* Branches:
         * (!compressed) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = new LazyECPoint(curveMock, byteArray);
            //Act Statement(s)
            LazyECPoint result = target.decompress();
            //Assert statement(s)
            assertThat(result, equalTo(target));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${a20c80a8-c85d-3813-b4f0-0c6ff7cbf090}
    @Ignore()
    @Test()
    public void decompressWhenCompressed() {
        /* Branches:
         * (!compressed) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock2 = mock(ECPoint.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 2, (byte) 121, (byte) 0, (byte) 102, (byte) 126, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 85, (byte) 0, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) 7, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 45, (byte) 0, (byte) 40, (byte) 0, (byte) 89, (byte) 0, (byte) 0, (byte) 91, (byte) 22, (byte) 0, (byte) 23, (byte) 0};
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
            verify(eCPointMock).normalize();
        }
    }

    //Sapient generated method id: ${0b3e2cb2-b90a-35e3-ad3b-d5fa478b50a9}
    @Test()
    public void getWhenPointIsNull() {
        /* Branches:
         * (point == null) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "UnknownObjectContent{target='org.bouncycastle.math.ec.ECPoint', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 3, (byte) 77, (byte) 94, (byte) 0, (byte) 63, (byte) 44, (byte) 93, (byte) 60, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${cf6fe54d-feda-3f5c-85e0-08a4ab2786ff}
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
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${243ea24e-c685-3c28-8d5d-82036e32e36f}
    @Test()
    public void getEncodedWhenBitsIsNull() {
        /* Branches:
         * (bits != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            eCKey.when(() -> ECKey.isPubKeyCompressed((byte[]) null)).thenReturn(true);
            LazyECPoint target = spy(new LazyECPoint(curveMock, (byte[]) null));
            doReturn(eCPointMock).when(target).get();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            //Act Statement(s)
            byte[] result = target.getEncoded();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            eCKey.verify(() -> ECKey.isPubKeyCompressed((byte[]) null), atLeast(1));
            verify(target).get();
            verify(eCPointMock).getEncoded(true);
        }
    }

    //Sapient generated method id: ${ec093c29-77ad-310d-9eb2-a17f82051d55}
    @Test()
    public void getDetachedPointTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 3, (byte) 127, (byte) 33, (byte) 93, (byte) 0, (byte) 0, (byte) 127, (byte) 0, (byte) 0, (byte) 77, (byte) 109, (byte) 94, (byte) 13, (byte) 60, (byte) 46, (byte) 31, (byte) 29, (byte) 45, (byte) 93, (byte) 95};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${869e5444-dcbf-37b2-948f-976c22592f57}
    @Test()
    public void isInfinityWhenGetIsInfinity() {
        /* Branches:
         * (get().isInfinity()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 2, (byte) 121, (byte) 0, (byte) 102, (byte) 126, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 85, (byte) 0, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) 7, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 45, (byte) 0, (byte) 40, (byte) 0, (byte) 89, (byte) 0, (byte) 0, (byte) 91, (byte) 22, (byte) 0, (byte) 23, (byte) 0};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${8021a96c-6ae1-35ac-9356-46b6091cbcda}
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

    //Sapient generated method id: ${fb6b4d1c-d7ef-38fa-9b44-19302eb6320b}
    @Test()
    public void timesPow2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).timesPow2(2);
            //Act Statement(s)
            ECPoint result = target.timesPow2(2);
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).timesPow2(2);
        }
    }

    //Sapient generated method id: ${6558fc31-f297-3cd3-9a02-5b320f5c50be}
    @Test()
    public void getYCoordTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 2, (byte) -117, (byte) -127, (byte) -99, (byte) 127, (byte) -113, (byte) 92, (byte) -99, (byte) 79, (byte) 94, (byte) 107, (byte) 31, (byte) 43, (byte) -114, (byte) -102, (byte) -99, (byte) 47, (byte) 61, (byte) 111, (byte) 95, (byte) 86, (byte) 109, (byte) 93, (byte) 15, (byte) 15, (byte) 63, (byte) -115, (byte) 93, (byte) -116, (byte) -99, (byte) 93};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${49afa737-d2d7-328e-a908-89094c52b7c2}
    @Test()
    public void getZCoordsTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 4, (byte) 90, (byte) 63, (byte) 42, (byte) 27, (byte) 12, (byte) 125, (byte) 110, (byte) 95, (byte) 74, (byte) 59, (byte) 44, (byte) 29, (byte) 14, (byte) 127, (byte) 112, (byte) 97, (byte) 82, (byte) 67, (byte) 52, (byte) 37, (byte) 22, (byte) 7, (byte) 120, (byte) 105, (byte) 90, (byte) 75, (byte) 60, (byte) 45, (byte) 30, (byte) 15};
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

    //Sapient generated method id: ${f655aeca-2a08-3b24-b7cc-2a929568754b}
    @Test()
    public void isNormalizedWhenGetIsNormalized() {
        /* Branches:
         * (get().isNormalized()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${399c726a-5663-3f08-b3e8-d806f401c21b}
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

    //Sapient generated method id: ${f2e2be9f-c5d7-3010-98aa-6831b8f18beb}
    @Test()
    public void multiplyTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 2, (byte) -118, (byte) 124, (byte) 111, (byte) -89, (byte) -115, (byte) 58, (byte) 122, (byte) 125, (byte) 62, (byte) 126, (byte) 125, (byte) 57, (byte) 30, (byte) 31, (byte) 28, (byte) 61, (byte) 60, (byte) 61, (byte) 60};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(eCPointMock).when(target).get();
            doReturn(eCPointMock2).when(eCPointMock).multiply(new BigInteger("2"));
            //Act Statement(s)
            ECPoint result = target.multiply(new BigInteger("2"));
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).get();
            verify(eCPointMock).multiply(new BigInteger("2"));
        }
    }

    //Sapient generated method id: ${97b5e3b9-042a-36e9-ba00-8365659a5608}
    @Test()
    public void subtractTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${0d94c6c3-3da3-39d9-a702-e44ed362e6fe}
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

    //Sapient generated method id: ${75cfa43f-4b3d-3c28-8ae3-16f3fb07c04d}
    @Test()
    public void isValidWhenGetNotIsValid() {
        /* Branches:
         * (get().isValid()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${3aa5318d-e14e-3d16-9a85-852b47f5735d}
    @Test()
    public void scaleYTest() {
        //Arrange Statement(s)
        ECFieldElement eCFieldElementMock = mock(ECFieldElement.class, "null");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
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

    //Sapient generated method id: ${dc0cbf17-5fe6-39b4-9cf3-8ca42085be8d}
    @Test()
    public void getXCoordTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${a79665bf-1481-398a-9071-7417e564009f}
    @Test()
    public void scaleXTest() {
        //Arrange Statement(s)
        ECFieldElement eCFieldElementMock = mock(ECFieldElement.class, "null");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
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

    //Sapient generated method id: ${00610e8a-308a-3060-9272-e6226990d3e8}
    @Test()
    public void negateTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${af01baf5-859c-378e-8dd0-d42173ef03ee}
    @Test()
    public void threeTimesTest() {
        //Arrange Statement(s)
        ECPoint eCPointMock2 = mock(ECPoint.class);
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

    //Sapient generated method id: ${abf61a24-83ad-3b61-9e1a-dc99b06e207f}
    @Test()
    public void getZCoordTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
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

    //Sapient generated method id: ${77f038b5-1865-3e33-a88c-2c57803f4614}
    @Test()
    public void getEncoded1WhenBitsIsNotNull() {
        /* Branches:
         * (compressed == isCompressed()) : true
         * (bits != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 2, (byte) 3, (byte) 4};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
            LazyECPoint target = spy(new LazyECPoint(curveMock, byteArray));
            doReturn(true).when(target).isCompressed();
            //Act Statement(s)
            byte[] result = target.getEncoded(true);
            byte[] byteResultArray = new byte[]{(byte) 2, (byte) 3, (byte) 4};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
            verify(target).isCompressed();
        }
    }

    //Sapient generated method id: ${f3d0addc-49af-3531-8d64-aafbf9ec182b}
    @Test()
    public void getEncoded1WhenBitsIsNull() {
        /* Branches:
         * (compressed == isCompressed()) : true
         * (bits != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            eCKey.when(() -> ECKey.isPubKeyCompressed((byte[]) null)).thenReturn(true);
            LazyECPoint target = spy(new LazyECPoint(curveMock, (byte[]) null));
            doReturn(true).when(target).isCompressed();
            doReturn(eCPointMock).when(target).get();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            //Act Statement(s)
            byte[] result = target.getEncoded(true);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            eCKey.verify(() -> ECKey.isPubKeyCompressed((byte[]) null), atLeast(1));
            verify(target).isCompressed();
            verify(target).get();
            verify(eCPointMock).getEncoded(true);
        }
    }

    //Sapient generated method id: ${2f52d914-224e-3cf8-a2e5-c61089a0f6f4}
    @Test()
    public void addTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${215b2d25-1bd5-3ed3-a110-763528295d03}
    @Test()
    public void twicePlusTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
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

    //Sapient generated method id: ${eb47973f-4d50-34cd-adc9-d630876f3801}
    @Test()
    public void getCurveTest() {
        //Arrange Statement(s)
        ECCurve eCCurveMock = mock(ECCurve.class, "UnknownObjectContent{target='org.bouncycastle.math.ec.ECCurve', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 2, (byte) -118, (byte) -124, (byte) 65, (byte) -101, (byte) 111, (byte) -71, (byte) 61, (byte) -106, (byte) -121, (byte) 14, (byte) 90, (byte) 56, (byte) 95, (byte) 22, (byte) -113, (byte) 28, (byte) 62, (byte) 11, (byte) 86};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${fd84fbe7-beb0-315d-afd1-860bd41a9b7f}
    @Test()
    public void normalizeTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 2, (byte) 121, (byte) 0, (byte) 102, (byte) 126, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 85, (byte) 0, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) 7, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 45, (byte) 0, (byte) 40, (byte) 0, (byte) 89, (byte) 0, (byte) 0, (byte) 91, (byte) 22, (byte) 0, (byte) 23};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${01740f11-0dda-3760-b445-66631166b4ec}
    @Test()
    public void getYTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${0d659186-8bb5-3c66-ab9d-e341cdcd9ed6}
    @Test()
    public void twiceTest() {
        //Arrange Statement(s)
        ECPoint eCPointMock2 = mock(ECPoint.class);
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

    //Sapient generated method id: ${3a7af79d-7d76-3ec2-94af-f9dab0a05761}
    @Test()
    public void getAffineYCoordTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(true);
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

    //Sapient generated method id: ${829eece6-438d-3fc4-9c7f-a40678792865}
    @Test()
    public void getAffineXCoordTest() {
        //Arrange Statement(s)
        ECFieldElement eCFieldElementMock = mock(ECFieldElement.class);
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

    //Sapient generated method id: ${2a257878-d67c-3b6b-a704-9e218a839d00}
    @Test()
    public void getXTest() {
        //Arrange Statement(s)
        ECFieldElement eCFieldElementMock = mock(ECFieldElement.class);
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
