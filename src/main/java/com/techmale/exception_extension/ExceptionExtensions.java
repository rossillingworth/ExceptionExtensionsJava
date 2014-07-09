/**
 * Copyright (c) 2014, Techmale <oss@techmale.com>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.techmale.exception_extension;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

/**
 * <h4>Exception extensions - making Exceptions easier.</h4>
 *
 * <p>
 * Replaces the exception boilerplate with a single line
 * producing better and more readable code. Contains both
 * checked and unchecked exceptions.
 * </p>
 *
 * <h5>Setup:</h5>
 *
 * <pre>
 *     {@code
 *  import static com.techmale.exception_extension.ExceptionExtensions.Lang.*;
 *     }
 * </pre>
 *
 * <h5>Usage</h5>
 * <pre>
 *     {@code
 *  IllegalArgumentException.when(myVar.equals("Foo"), "Bad value for myVar: %s", myvar);
 *     }
 * </pre>
 */
public class ExceptionExtensions<T extends Exception> {

    public static class Beans{
        public static final ExceptionExtensions<java.beans.IntrospectionException> IntrospectionExceptionBeans = new ExceptionExtensions(java.beans.IntrospectionException.class);
        public static final ExceptionExtensions<java.beans.PropertyVetoException> PropertyVetoException = new ExceptionExtensions(java.beans.PropertyVetoException.class);
    }

    public static class Io{
        public static final ExceptionExtensions<java.io.CharConversionException> CharConversionException = new ExceptionExtensions(java.io.CharConversionException.class);
        public static final ExceptionExtensions<java.io.EOFException> EOFException = new ExceptionExtensions(java.io.EOFException.class);
        public static final ExceptionExtensions<java.io.FileNotFoundException> FileNotFoundException = new ExceptionExtensions(java.io.FileNotFoundException.class);
        public static final ExceptionExtensions<java.io.InterruptedIOException> InterruptedIOException = new ExceptionExtensions(java.io.InterruptedIOException.class);
        public static final ExceptionExtensions<java.io.InvalidClassException> InvalidClassException = new ExceptionExtensions(java.io.InvalidClassException.class);
        public static final ExceptionExtensions<java.io.InvalidObjectException> InvalidObjectException = new ExceptionExtensions(java.io.InvalidObjectException.class);
        public static final ExceptionExtensions<java.io.IOException> IOException = new ExceptionExtensions(java.io.IOException.class);
        public static final ExceptionExtensions<java.io.NotActiveException> NotActiveException = new ExceptionExtensions(java.io.NotActiveException.class);
        public static final ExceptionExtensions<java.io.NotSerializableException> NotSerializableException = new ExceptionExtensions(java.io.NotSerializableException.class);
        public static final ExceptionExtensions<java.io.ObjectStreamException> ObjectStreamException = new ExceptionExtensions(java.io.ObjectStreamException.class);
        public static final ExceptionExtensions<java.io.OptionalDataException> OptionalDataException = new ExceptionExtensions(java.io.OptionalDataException.class);
        public static final ExceptionExtensions<java.io.StreamCorruptedException> StreamCorruptedException = new ExceptionExtensions(java.io.StreamCorruptedException.class);
        public static final ExceptionExtensions<java.io.SyncFailedException> SyncFailedException = new ExceptionExtensions(java.io.SyncFailedException.class);
        public static final ExceptionExtensions<java.io.UnsupportedEncodingException> UnsupportedEncodingException = new ExceptionExtensions(java.io.UnsupportedEncodingException.class);
        public static final ExceptionExtensions<java.io.UTFDataFormatException> UTFDataFormatException = new ExceptionExtensions(java.io.UTFDataFormatException.class);
        public static final ExceptionExtensions<java.io.WriteAbortedException> WriteAbortedException = new ExceptionExtensions(java.io.WriteAbortedException.class);
    }

    public static class Lang{
        public static final ExceptionExtensions<java.lang.annotation.AnnotationTypeMismatchException> AnnotationTypeMismatchException = new ExceptionExtensions(java.lang.annotation.AnnotationTypeMismatchException.class);
        public static final ExceptionExtensions<java.lang.annotation.IncompleteAnnotationException> IncompleteAnnotationException = new ExceptionExtensions(java.lang.annotation.IncompleteAnnotationException.class);
        public static final ExceptionExtensions<java.lang.ArithmeticException> ArithmeticException = new ExceptionExtensions(java.lang.ArithmeticException.class);
        public static final ExceptionExtensions<java.lang.ArrayIndexOutOfBoundsException> ArrayIndexOutOfBoundsException = new ExceptionExtensions(java.lang.ArrayIndexOutOfBoundsException.class);
        public static final ExceptionExtensions<java.lang.ArrayStoreException> ArrayStoreException = new ExceptionExtensions(java.lang.ArrayStoreException.class);
        public static final ExceptionExtensions<java.lang.ClassCastException> ClassCastException = new ExceptionExtensions(java.lang.ClassCastException.class);
        public static final ExceptionExtensions<java.lang.ClassNotFoundException> ClassNotFoundException = new ExceptionExtensions(java.lang.ClassNotFoundException.class);
        public static final ExceptionExtensions<java.lang.CloneNotSupportedException> CloneNotSupportedException = new ExceptionExtensions(java.lang.CloneNotSupportedException.class);
        public static final ExceptionExtensions<java.lang.EnumConstantNotPresentException> EnumConstantNotPresentException = new ExceptionExtensions(java.lang.EnumConstantNotPresentException.class);
        public static final ExceptionExtensions<java.lang.Exception> Exception = new ExceptionExtensions(java.lang.Exception.class);
        public static final ExceptionExtensions<java.lang.IllegalArgumentException> IllegalArgumentException = new ExceptionExtensions(java.lang.IllegalArgumentException.class);
        public static final ExceptionExtensions<java.lang.IllegalMonitorStateException> IllegalMonitorStateException = new ExceptionExtensions(java.lang.IllegalMonitorStateException.class);
        public static final ExceptionExtensions<java.lang.IllegalStateException> IllegalStateException = new ExceptionExtensions(java.lang.IllegalStateException.class);
        public static final ExceptionExtensions<java.lang.IllegalThreadStateException> IllegalThreadStateException = new ExceptionExtensions(java.lang.IllegalThreadStateException.class);
        public static final ExceptionExtensions<java.lang.IndexOutOfBoundsException> IndexOutOfBoundsException = new ExceptionExtensions(java.lang.IndexOutOfBoundsException.class);
        public static final ExceptionExtensions<java.lang.instrument.IllegalClassFormatException> IllegalClassFormatException = new ExceptionExtensions(java.lang.instrument.IllegalClassFormatException.class);
        public static final ExceptionExtensions<java.lang.instrument.UnmodifiableClassException> UnmodifiableClassException = new ExceptionExtensions(java.lang.instrument.UnmodifiableClassException.class);
        public static final ExceptionExtensions<java.lang.InterruptedException> InterruptedException = new ExceptionExtensions(java.lang.InterruptedException.class);
        public static final ExceptionExtensions<java.lang.invoke.WrongMethodTypeException> WrongMethodTypeException = new ExceptionExtensions(java.lang.invoke.WrongMethodTypeException.class);
        public static final ExceptionExtensions<java.lang.NegativeArraySizeException> NegativeArraySizeException = new ExceptionExtensions(java.lang.NegativeArraySizeException.class);
        public static final ExceptionExtensions<java.lang.NoSuchFieldException> NoSuchFieldException = new ExceptionExtensions(java.lang.NoSuchFieldException.class);
        public static final ExceptionExtensions<java.lang.NullPointerException> NullPointerException = new ExceptionExtensions(java.lang.NullPointerException.class);
        public static final ExceptionExtensions<java.lang.NumberFormatException> NumberFormatException = new ExceptionExtensions(java.lang.NumberFormatException.class);
        public static final ExceptionExtensions<java.lang.ReflectiveOperationException> ReflectiveOperationException = new ExceptionExtensions(java.lang.ReflectiveOperationException.class);
        public static final ExceptionExtensions<java.lang.reflect.MalformedParameterizedTypeException> MalformedParameterizedTypeException = new ExceptionExtensions(java.lang.reflect.MalformedParameterizedTypeException.class);
        public static final ExceptionExtensions<java.lang.reflect.UndeclaredThrowableException> UndeclaredThrowableException = new ExceptionExtensions(java.lang.reflect.UndeclaredThrowableException.class);
        public static final ExceptionExtensions<java.lang.RuntimeException> RuntimeException = new ExceptionExtensions(java.lang.RuntimeException.class);
        public static final ExceptionExtensions<java.lang.SecurityException> SecurityException = new ExceptionExtensions(java.lang.SecurityException.class);
        public static final ExceptionExtensions<java.lang.StringIndexOutOfBoundsException> StringIndexOutOfBoundsException = new ExceptionExtensions(java.lang.StringIndexOutOfBoundsException.class);
        public static final ExceptionExtensions<java.lang.TypeNotPresentException> TypeNotPresentException = new ExceptionExtensions(java.lang.TypeNotPresentException.class);
        public static final ExceptionExtensions<java.lang.UnsupportedOperationException> UnsupportedOperationException = new ExceptionExtensions(java.lang.UnsupportedOperationException.class);
    }

    public static class Net{
        public static final ExceptionExtensions<java.net.BindException> BindException = new ExceptionExtensions(java.net.BindException.class);
        public static final ExceptionExtensions<java.net.ConnectException> ConnectExceptionNet = new ExceptionExtensions(java.net.ConnectException.class);
        public static final ExceptionExtensions<java.net.HttpRetryException> HttpRetryException = new ExceptionExtensions(java.net.HttpRetryException.class);
        public static final ExceptionExtensions<java.net.MalformedURLException> MalformedURLException = new ExceptionExtensions(java.net.MalformedURLException.class);
        public static final ExceptionExtensions<java.net.NoRouteToHostException> NoRouteToHostException = new ExceptionExtensions(java.net.NoRouteToHostException.class);
        public static final ExceptionExtensions<java.net.PortUnreachableException> PortUnreachableException = new ExceptionExtensions(java.net.PortUnreachableException.class);
        public static final ExceptionExtensions<java.net.ProtocolException> ProtocolExceptionNet = new ExceptionExtensions(java.net.ProtocolException.class);
        public static final ExceptionExtensions<java.net.SocketException> SocketException = new ExceptionExtensions(java.net.SocketException.class);
        public static final ExceptionExtensions<java.net.SocketTimeoutException> SocketTimeoutException = new ExceptionExtensions(java.net.SocketTimeoutException.class);
        public static final ExceptionExtensions<java.net.UnknownHostException> UnknownHostExceptionNet = new ExceptionExtensions(java.net.UnknownHostException.class);
        public static final ExceptionExtensions<java.net.UnknownServiceException> UnknownServiceException = new ExceptionExtensions(java.net.UnknownServiceException.class);
        public static final ExceptionExtensions<java.net.URISyntaxException> URISyntaxException = new ExceptionExtensions(java.net.URISyntaxException.class);
    }

    public static class Nio{
        public static final ExceptionExtensions<java.nio.BufferOverflowException> BufferOverflowException = new ExceptionExtensions(java.nio.BufferOverflowException.class);
        public static final ExceptionExtensions<java.nio.BufferUnderflowException> BufferUnderflowException = new ExceptionExtensions(java.nio.BufferUnderflowException.class);
        public static final ExceptionExtensions<java.nio.channels.AcceptPendingException> AcceptPendingException = new ExceptionExtensions(java.nio.channels.AcceptPendingException.class);
        public static final ExceptionExtensions<java.nio.channels.AlreadyBoundException> AlreadyBoundExceptionChannels = new ExceptionExtensions(java.nio.channels.AlreadyBoundException.class);
        public static final ExceptionExtensions<java.nio.channels.AlreadyConnectedException> AlreadyConnectedException = new ExceptionExtensions(java.nio.channels.AlreadyConnectedException.class);
        public static final ExceptionExtensions<java.nio.channels.AsynchronousCloseException> AsynchronousCloseException = new ExceptionExtensions(java.nio.channels.AsynchronousCloseException.class);
        public static final ExceptionExtensions<java.nio.channels.CancelledKeyException> CancelledKeyException = new ExceptionExtensions(java.nio.channels.CancelledKeyException.class);
        public static final ExceptionExtensions<java.nio.channels.ClosedByInterruptException> ClosedByInterruptException = new ExceptionExtensions(java.nio.channels.ClosedByInterruptException.class);
        public static final ExceptionExtensions<java.nio.channels.ClosedChannelException> ClosedChannelException = new ExceptionExtensions(java.nio.channels.ClosedChannelException.class);
        public static final ExceptionExtensions<java.nio.channels.ClosedSelectorException> ClosedSelectorException = new ExceptionExtensions(java.nio.channels.ClosedSelectorException.class);
        public static final ExceptionExtensions<java.nio.channels.ConnectionPendingException> ConnectionPendingException = new ExceptionExtensions(java.nio.channels.ConnectionPendingException.class);
        public static final ExceptionExtensions<java.nio.channels.FileLockInterruptionException> FileLockInterruptionException = new ExceptionExtensions(java.nio.channels.FileLockInterruptionException.class);
        public static final ExceptionExtensions<java.nio.channels.IllegalBlockingModeException> IllegalBlockingModeException = new ExceptionExtensions(java.nio.channels.IllegalBlockingModeException.class);
        public static final ExceptionExtensions<java.nio.channels.IllegalChannelGroupException> IllegalChannelGroupException = new ExceptionExtensions(java.nio.channels.IllegalChannelGroupException.class);
        public static final ExceptionExtensions<java.nio.channels.IllegalSelectorException> IllegalSelectorException = new ExceptionExtensions(java.nio.channels.IllegalSelectorException.class);
        public static final ExceptionExtensions<java.nio.channels.InterruptedByTimeoutException> InterruptedByTimeoutException = new ExceptionExtensions(java.nio.channels.InterruptedByTimeoutException.class);
        public static final ExceptionExtensions<java.nio.channels.NoConnectionPendingException> NoConnectionPendingException = new ExceptionExtensions(java.nio.channels.NoConnectionPendingException.class);
        public static final ExceptionExtensions<java.nio.channels.NonReadableChannelException> NonReadableChannelException = new ExceptionExtensions(java.nio.channels.NonReadableChannelException.class);
        public static final ExceptionExtensions<java.nio.channels.NonWritableChannelException> NonWritableChannelException = new ExceptionExtensions(java.nio.channels.NonWritableChannelException.class);
        public static final ExceptionExtensions<java.nio.channels.NotYetBoundException> NotYetBoundException = new ExceptionExtensions(java.nio.channels.NotYetBoundException.class);
        public static final ExceptionExtensions<java.nio.channels.NotYetConnectedException> NotYetConnectedException = new ExceptionExtensions(java.nio.channels.NotYetConnectedException.class);
        public static final ExceptionExtensions<java.nio.channels.OverlappingFileLockException> OverlappingFileLockException = new ExceptionExtensions(java.nio.channels.OverlappingFileLockException.class);
        public static final ExceptionExtensions<java.nio.channels.ReadPendingException> ReadPendingException = new ExceptionExtensions(java.nio.channels.ReadPendingException.class);
        public static final ExceptionExtensions<java.nio.channels.ShutdownChannelGroupException> ShutdownChannelGroupException = new ExceptionExtensions(java.nio.channels.ShutdownChannelGroupException.class);
        public static final ExceptionExtensions<java.nio.channels.UnresolvedAddressException> UnresolvedAddressException = new ExceptionExtensions(java.nio.channels.UnresolvedAddressException.class);
        public static final ExceptionExtensions<java.nio.channels.UnsupportedAddressTypeException> UnsupportedAddressTypeException = new ExceptionExtensions(java.nio.channels.UnsupportedAddressTypeException.class);
        public static final ExceptionExtensions<java.nio.channels.WritePendingException> WritePendingException = new ExceptionExtensions(java.nio.channels.WritePendingException.class);
        public static final ExceptionExtensions<java.nio.charset.CharacterCodingException> CharacterCodingException = new ExceptionExtensions(java.nio.charset.CharacterCodingException.class);
        public static final ExceptionExtensions<java.nio.charset.IllegalCharsetNameException> IllegalCharsetNameException = new ExceptionExtensions(java.nio.charset.IllegalCharsetNameException.class);
        public static final ExceptionExtensions<java.nio.charset.MalformedInputException> MalformedInputException = new ExceptionExtensions(java.nio.charset.MalformedInputException.class);
        public static final ExceptionExtensions<java.nio.charset.UnmappableCharacterException> UnmappableCharacterException = new ExceptionExtensions(java.nio.charset.UnmappableCharacterException.class);
        public static final ExceptionExtensions<java.nio.charset.UnsupportedCharsetException> UnsupportedCharsetException = new ExceptionExtensions(java.nio.charset.UnsupportedCharsetException.class);
        public static final ExceptionExtensions<java.nio.file.AccessDeniedException> AccessDeniedException = new ExceptionExtensions(java.nio.file.AccessDeniedException.class);
        public static final ExceptionExtensions<java.nio.file.AtomicMoveNotSupportedException> AtomicMoveNotSupportedException = new ExceptionExtensions(java.nio.file.AtomicMoveNotSupportedException.class);
        public static final ExceptionExtensions<java.nio.file.attribute.UserPrincipalNotFoundException> UserPrincipalNotFoundException = new ExceptionExtensions(java.nio.file.attribute.UserPrincipalNotFoundException.class);
        public static final ExceptionExtensions<java.nio.file.ClosedDirectoryStreamException> ClosedDirectoryStreamException = new ExceptionExtensions(java.nio.file.ClosedDirectoryStreamException.class);
        public static final ExceptionExtensions<java.nio.file.ClosedFileSystemException> ClosedFileSystemException = new ExceptionExtensions(java.nio.file.ClosedFileSystemException.class);
        public static final ExceptionExtensions<java.nio.file.ClosedWatchServiceException> ClosedWatchServiceException = new ExceptionExtensions(java.nio.file.ClosedWatchServiceException.class);
        public static final ExceptionExtensions<java.nio.file.DirectoryIteratorException> DirectoryIteratorException = new ExceptionExtensions(java.nio.file.DirectoryIteratorException.class);
        public static final ExceptionExtensions<java.nio.file.DirectoryNotEmptyException> DirectoryNotEmptyException = new ExceptionExtensions(java.nio.file.DirectoryNotEmptyException.class);
        public static final ExceptionExtensions<java.nio.file.FileAlreadyExistsException> FileAlreadyExistsException = new ExceptionExtensions(java.nio.file.FileAlreadyExistsException.class);
        public static final ExceptionExtensions<java.nio.file.FileSystemAlreadyExistsException> FileSystemAlreadyExistsException = new ExceptionExtensions(java.nio.file.FileSystemAlreadyExistsException.class);
        public static final ExceptionExtensions<java.nio.file.FileSystemException> FileSystemException = new ExceptionExtensions(java.nio.file.FileSystemException.class);
        public static final ExceptionExtensions<java.nio.file.FileSystemLoopException> FileSystemLoopException = new ExceptionExtensions(java.nio.file.FileSystemLoopException.class);
        public static final ExceptionExtensions<java.nio.file.FileSystemNotFoundException> FileSystemNotFoundException = new ExceptionExtensions(java.nio.file.FileSystemNotFoundException.class);
        public static final ExceptionExtensions<java.nio.file.InvalidPathException> InvalidPathException = new ExceptionExtensions(java.nio.file.InvalidPathException.class);
        public static final ExceptionExtensions<java.nio.file.NoSuchFileException> NoSuchFileException = new ExceptionExtensions(java.nio.file.NoSuchFileException.class);
        public static final ExceptionExtensions<java.nio.file.NotDirectoryException> NotDirectoryException = new ExceptionExtensions(java.nio.file.NotDirectoryException.class);
        public static final ExceptionExtensions<java.nio.file.NotLinkException> NotLinkException = new ExceptionExtensions(java.nio.file.NotLinkException.class);
        public static final ExceptionExtensions<java.nio.file.ProviderMismatchException> ProviderMismatchException = new ExceptionExtensions(java.nio.file.ProviderMismatchException.class);
        public static final ExceptionExtensions<java.nio.file.ProviderNotFoundException> ProviderNotFoundException = new ExceptionExtensions(java.nio.file.ProviderNotFoundException.class);
        public static final ExceptionExtensions<java.nio.file.ReadOnlyFileSystemException> ReadOnlyFileSystemException = new ExceptionExtensions(java.nio.file.ReadOnlyFileSystemException.class);
        public static final ExceptionExtensions<java.nio.InvalidMarkException> InvalidMarkException = new ExceptionExtensions(java.nio.InvalidMarkException.class);
        public static final ExceptionExtensions<java.nio.ReadOnlyBufferException> ReadOnlyBufferException = new ExceptionExtensions(java.nio.ReadOnlyBufferException.class);
    }

    public static class Rmi{
        public static final ExceptionExtensions<java.rmi.AccessException> AccessException = new ExceptionExtensions(java.rmi.AccessException.class);
        public static final ExceptionExtensions<java.rmi.activation.ActivateFailedException> ActivateFailedException = new ExceptionExtensions(java.rmi.activation.ActivateFailedException.class);
        public static final ExceptionExtensions<java.rmi.activation.ActivationException> ActivationException = new ExceptionExtensions(java.rmi.activation.ActivationException.class);
        public static final ExceptionExtensions<java.rmi.activation.UnknownGroupException> UnknownGroupException = new ExceptionExtensions(java.rmi.activation.UnknownGroupException.class);
        public static final ExceptionExtensions<java.rmi.activation.UnknownObjectException> UnknownObjectException = new ExceptionExtensions(java.rmi.activation.UnknownObjectException.class);
        public static final ExceptionExtensions<java.rmi.AlreadyBoundException> AlreadyBoundExceptionRmi = new ExceptionExtensions(java.rmi.AlreadyBoundException.class);
        public static final ExceptionExtensions<java.rmi.ConnectException> ConnectExceptionRmi = new ExceptionExtensions(java.rmi.ConnectException.class);
        public static final ExceptionExtensions<java.rmi.ConnectIOException> ConnectIOException = new ExceptionExtensions(java.rmi.ConnectIOException.class);
        public static final ExceptionExtensions<java.rmi.MarshalException> MarshalExceptionRmi = new ExceptionExtensions(java.rmi.MarshalException.class);
        public static final ExceptionExtensions<java.rmi.NoSuchObjectException> NoSuchObjectException = new ExceptionExtensions(java.rmi.NoSuchObjectException.class);
        public static final ExceptionExtensions<java.rmi.NotBoundException> NotBoundException = new ExceptionExtensions(java.rmi.NotBoundException.class);
        public static final ExceptionExtensions<java.rmi.RemoteException> RemoteException = new ExceptionExtensions(java.rmi.RemoteException.class);
        public static final ExceptionExtensions<java.rmi.RMISecurityException> RMISecurityException = new ExceptionExtensions(java.rmi.RMISecurityException.class);
        public static final ExceptionExtensions<java.rmi.ServerException> ServerException = new ExceptionExtensions(java.rmi.ServerException.class);
        public static final ExceptionExtensions<java.rmi.server.ExportException> ExportException = new ExceptionExtensions(java.rmi.server.ExportException.class);
        public static final ExceptionExtensions<java.rmi.ServerRuntimeException> ServerRuntimeException = new ExceptionExtensions(java.rmi.ServerRuntimeException.class);
        public static final ExceptionExtensions<java.rmi.server.ServerCloneException> ServerCloneException = new ExceptionExtensions(java.rmi.server.ServerCloneException.class);
        public static final ExceptionExtensions<java.rmi.server.ServerNotActiveException> ServerNotActiveException = new ExceptionExtensions(java.rmi.server.ServerNotActiveException.class);
        public static final ExceptionExtensions<java.rmi.server.SkeletonMismatchException> SkeletonMismatchException = new ExceptionExtensions(java.rmi.server.SkeletonMismatchException.class);
        public static final ExceptionExtensions<java.rmi.server.SkeletonNotFoundException> SkeletonNotFoundException = new ExceptionExtensions(java.rmi.server.SkeletonNotFoundException.class);
        public static final ExceptionExtensions<java.rmi.server.SocketSecurityException> SocketSecurityException = new ExceptionExtensions(java.rmi.server.SocketSecurityException.class);
        public static final ExceptionExtensions<java.rmi.StubNotFoundException> StubNotFoundException = new ExceptionExtensions(java.rmi.StubNotFoundException.class);
        public static final ExceptionExtensions<java.rmi.UnexpectedException> UnexpectedException = new ExceptionExtensions(java.rmi.UnexpectedException.class);
        public static final ExceptionExtensions<java.rmi.UnknownHostException> UnknownHostExceptionRmi = new ExceptionExtensions(java.rmi.UnknownHostException.class);
        public static final ExceptionExtensions<java.rmi.UnmarshalException> UnmarshalExceptionRmi = new ExceptionExtensions(java.rmi.UnmarshalException.class);
    }

    public static class Security{
        public static final ExceptionExtensions<java.security.AccessControlException> AccessControlException = new ExceptionExtensions(java.security.AccessControlException.class);
        public static final ExceptionExtensions<java.security.acl.AclNotFoundException> AclNotFoundException = new ExceptionExtensions(java.security.acl.AclNotFoundException.class);
        public static final ExceptionExtensions<java.security.acl.LastOwnerException> LastOwnerException = new ExceptionExtensions(java.security.acl.LastOwnerException.class);
        public static final ExceptionExtensions<java.security.acl.NotOwnerException> NotOwnerException = new ExceptionExtensions(java.security.acl.NotOwnerException.class);
        public static final ExceptionExtensions<java.security.cert.CertificateEncodingException> CertificateEncodingExceptionJava = new ExceptionExtensions(java.security.cert.CertificateEncodingException.class);
        public static final ExceptionExtensions<java.security.cert.CertificateException> CertificateExceptionJava = new ExceptionExtensions(java.security.cert.CertificateException.class);
        public static final ExceptionExtensions<java.security.cert.CertificateExpiredException> CertificateExpiredExceptionJava = new ExceptionExtensions(java.security.cert.CertificateExpiredException.class);
        public static final ExceptionExtensions<java.security.cert.CertificateNotYetValidException> CertificateNotYetValidExceptionJava = new ExceptionExtensions(java.security.cert.CertificateNotYetValidException.class);
        public static final ExceptionExtensions<java.security.cert.CertificateParsingException> CertificateParsingExceptionJava = new ExceptionExtensions(java.security.cert.CertificateParsingException.class);
        public static final ExceptionExtensions<java.security.cert.CertificateRevokedException> CertificateRevokedException = new ExceptionExtensions(java.security.cert.CertificateRevokedException.class);
        public static final ExceptionExtensions<java.security.cert.CertPathBuilderException> CertPathBuilderException = new ExceptionExtensions(java.security.cert.CertPathBuilderException.class);
        public static final ExceptionExtensions<java.security.cert.CertPathValidatorException> CertPathValidatorException = new ExceptionExtensions(java.security.cert.CertPathValidatorException.class);
        public static final ExceptionExtensions<java.security.cert.CertStoreException> CertStoreException = new ExceptionExtensions(java.security.cert.CertStoreException.class);
        public static final ExceptionExtensions<java.security.cert.CRLException> CRLException = new ExceptionExtensions(java.security.cert.CRLException.class);
        public static final ExceptionExtensions<java.security.DigestException> DigestException = new ExceptionExtensions(java.security.DigestException.class);
        public static final ExceptionExtensions<java.security.GeneralSecurityException> GeneralSecurityException = new ExceptionExtensions(java.security.GeneralSecurityException.class);
        public static final ExceptionExtensions<java.security.InvalidAlgorithmParameterException> InvalidAlgorithmParameterException = new ExceptionExtensions(java.security.InvalidAlgorithmParameterException.class);
        public static final ExceptionExtensions<java.security.InvalidKeyException> InvalidKeyExceptionSecurity = new ExceptionExtensions(java.security.InvalidKeyException.class);
        public static final ExceptionExtensions<java.security.InvalidParameterException> InvalidParameterException = new ExceptionExtensions(java.security.InvalidParameterException.class);
        public static final ExceptionExtensions<java.security.KeyException> KeyException = new ExceptionExtensions(java.security.KeyException.class);
        public static final ExceptionExtensions<java.security.KeyManagementException> KeyManagementException = new ExceptionExtensions(java.security.KeyManagementException.class);
        public static final ExceptionExtensions<java.security.KeyStoreException> KeyStoreException = new ExceptionExtensions(java.security.KeyStoreException.class);
        public static final ExceptionExtensions<java.security.NoSuchAlgorithmException> NoSuchAlgorithmException = new ExceptionExtensions(java.security.NoSuchAlgorithmException.class);
        public static final ExceptionExtensions<java.security.NoSuchProviderException> NoSuchProviderException = new ExceptionExtensions(java.security.NoSuchProviderException.class);
        public static final ExceptionExtensions<java.security.PrivilegedActionException> PrivilegedActionException = new ExceptionExtensions(java.security.PrivilegedActionException.class);
        public static final ExceptionExtensions<java.security.ProviderException> ProviderException = new ExceptionExtensions(java.security.ProviderException.class);
        public static final ExceptionExtensions<java.security.SignatureException> SignatureException = new ExceptionExtensions(java.security.SignatureException.class);
        public static final ExceptionExtensions<java.security.spec.InvalidKeySpecException> InvalidKeySpecException = new ExceptionExtensions(java.security.spec.InvalidKeySpecException.class);
        public static final ExceptionExtensions<java.security.spec.InvalidParameterSpecException> InvalidParameterSpecException = new ExceptionExtensions(java.security.spec.InvalidParameterSpecException.class);
        public static final ExceptionExtensions<java.security.UnrecoverableEntryException> UnrecoverableEntryException = new ExceptionExtensions(java.security.UnrecoverableEntryException.class);
        public static final ExceptionExtensions<java.security.UnrecoverableKeyException> UnrecoverableKeyException = new ExceptionExtensions(java.security.UnrecoverableKeyException.class);
    }

    public static class Sql{
        public static final ExceptionExtensions<java.sql.BatchUpdateException> BatchUpdateException = new ExceptionExtensions(java.sql.BatchUpdateException.class);
        public static final ExceptionExtensions<java.sql.SQLClientInfoException> SQLClientInfoException = new ExceptionExtensions(java.sql.SQLClientInfoException.class);
        public static final ExceptionExtensions<java.sql.SQLDataException> SQLDataException = new ExceptionExtensions(java.sql.SQLDataException.class);
        public static final ExceptionExtensions<java.sql.SQLException> SQLException = new ExceptionExtensions(java.sql.SQLException.class);
        public static final ExceptionExtensions<java.sql.SQLFeatureNotSupportedException> SQLFeatureNotSupportedException = new ExceptionExtensions(java.sql.SQLFeatureNotSupportedException.class);
        public static final ExceptionExtensions<java.sql.SQLIntegrityConstraintViolationException> SQLIntegrityConstraintViolationException = new ExceptionExtensions(java.sql.SQLIntegrityConstraintViolationException.class);
        public static final ExceptionExtensions<java.sql.SQLInvalidAuthorizationSpecException> SQLInvalidAuthorizationSpecException = new ExceptionExtensions(java.sql.SQLInvalidAuthorizationSpecException.class);
        public static final ExceptionExtensions<java.sql.SQLNonTransientConnectionException> SQLNonTransientConnectionException = new ExceptionExtensions(java.sql.SQLNonTransientConnectionException.class);
        public static final ExceptionExtensions<java.sql.SQLNonTransientException> SQLNonTransientException = new ExceptionExtensions(java.sql.SQLNonTransientException.class);
        public static final ExceptionExtensions<java.sql.SQLRecoverableException> SQLRecoverableException = new ExceptionExtensions(java.sql.SQLRecoverableException.class);
        public static final ExceptionExtensions<java.sql.SQLSyntaxErrorException> SQLSyntaxErrorException = new ExceptionExtensions(java.sql.SQLSyntaxErrorException.class);
        public static final ExceptionExtensions<java.sql.SQLTimeoutException> SQLTimeoutException = new ExceptionExtensions(java.sql.SQLTimeoutException.class);
        public static final ExceptionExtensions<java.sql.SQLTransactionRollbackException> SQLTransactionRollbackException = new ExceptionExtensions(java.sql.SQLTransactionRollbackException.class);
        public static final ExceptionExtensions<java.sql.SQLTransientConnectionException> SQLTransientConnectionException = new ExceptionExtensions(java.sql.SQLTransientConnectionException.class);
        public static final ExceptionExtensions<java.sql.SQLTransientException> SQLTransientException = new ExceptionExtensions(java.sql.SQLTransientException.class);
    }

    public static class Text{
        public static final ExceptionExtensions<java.text.ParseException> ParseException = new ExceptionExtensions(java.text.ParseException.class);
    }

    public static class Util{
        public static final ExceptionExtensions<java.util.concurrent.BrokenBarrierException> BrokenBarrierException = new ExceptionExtensions(java.util.concurrent.BrokenBarrierException.class);
        public static final ExceptionExtensions<java.util.concurrent.CancellationException> CancellationException = new ExceptionExtensions(java.util.concurrent.CancellationException.class);
        public static final ExceptionExtensions<java.util.concurrent.ExecutionException> ExecutionException = new ExceptionExtensions(java.util.concurrent.ExecutionException.class);
        public static final ExceptionExtensions<java.util.ConcurrentModificationException> ConcurrentModificationException = new ExceptionExtensions(java.util.ConcurrentModificationException.class);
        public static final ExceptionExtensions<java.util.concurrent.RejectedExecutionException> RejectedExecutionException = new ExceptionExtensions(java.util.concurrent.RejectedExecutionException.class);
        public static final ExceptionExtensions<java.util.concurrent.TimeoutException> TimeoutException = new ExceptionExtensions(java.util.concurrent.TimeoutException.class);
        public static final ExceptionExtensions<java.util.DuplicateFormatFlagsException> DuplicateFormatFlagsException = new ExceptionExtensions(java.util.DuplicateFormatFlagsException.class);
        public static final ExceptionExtensions<java.util.EmptyStackException> EmptyStackException = new ExceptionExtensions(java.util.EmptyStackException.class);
        public static final ExceptionExtensions<java.util.FormatFlagsConversionMismatchException> FormatFlagsConversionMismatchException = new ExceptionExtensions(java.util.FormatFlagsConversionMismatchException.class);
        public static final ExceptionExtensions<java.util.FormatterClosedException> FormatterClosedException = new ExceptionExtensions(java.util.FormatterClosedException.class);
        public static final ExceptionExtensions<java.util.IllegalFormatCodePointException> IllegalFormatCodePointException = new ExceptionExtensions(java.util.IllegalFormatCodePointException.class);
        public static final ExceptionExtensions<java.util.IllegalFormatConversionException> IllegalFormatConversionException = new ExceptionExtensions(java.util.IllegalFormatConversionException.class);
        public static final ExceptionExtensions<java.util.IllegalFormatException> IllegalFormatException = new ExceptionExtensions(java.util.IllegalFormatException.class);
        public static final ExceptionExtensions<java.util.IllegalFormatFlagsException> IllegalFormatFlagsException = new ExceptionExtensions(java.util.IllegalFormatFlagsException.class);
        public static final ExceptionExtensions<java.util.IllegalFormatPrecisionException> IllegalFormatPrecisionException = new ExceptionExtensions(java.util.IllegalFormatPrecisionException.class);
        public static final ExceptionExtensions<java.util.IllegalFormatWidthException> IllegalFormatWidthException = new ExceptionExtensions(java.util.IllegalFormatWidthException.class);
        public static final ExceptionExtensions<java.util.IllformedLocaleException> IllformedLocaleException = new ExceptionExtensions(java.util.IllformedLocaleException.class);
        public static final ExceptionExtensions<java.util.InputMismatchException> InputMismatchException = new ExceptionExtensions(java.util.InputMismatchException.class);
        public static final ExceptionExtensions<java.util.InvalidPropertiesFormatException> InvalidPropertiesFormatException = new ExceptionExtensions(java.util.InvalidPropertiesFormatException.class);
        public static final ExceptionExtensions<java.util.jar.JarException> JarException = new ExceptionExtensions(java.util.jar.JarException.class);
        public static final ExceptionExtensions<java.util.MissingFormatArgumentException> MissingFormatArgumentException = new ExceptionExtensions(java.util.MissingFormatArgumentException.class);
        public static final ExceptionExtensions<java.util.MissingFormatWidthException> MissingFormatWidthException = new ExceptionExtensions(java.util.MissingFormatWidthException.class);
        public static final ExceptionExtensions<java.util.MissingResourceException> MissingResourceException = new ExceptionExtensions(java.util.MissingResourceException.class);
        public static final ExceptionExtensions<java.util.NoSuchElementException> NoSuchElementException = new ExceptionExtensions(java.util.NoSuchElementException.class);
        public static final ExceptionExtensions<java.util.prefs.BackingStoreException> BackingStoreException = new ExceptionExtensions(java.util.prefs.BackingStoreException.class);
        public static final ExceptionExtensions<java.util.prefs.InvalidPreferencesFormatException> InvalidPreferencesFormatException = new ExceptionExtensions(java.util.prefs.InvalidPreferencesFormatException.class);
        public static final ExceptionExtensions<java.util.regex.PatternSyntaxException> PatternSyntaxException = new ExceptionExtensions(java.util.regex.PatternSyntaxException.class);
        public static final ExceptionExtensions<java.util.TooManyListenersException> TooManyListenersException = new ExceptionExtensions(java.util.TooManyListenersException.class);
        public static final ExceptionExtensions<java.util.UnknownFormatConversionException> UnknownFormatConversionException = new ExceptionExtensions(java.util.UnknownFormatConversionException.class);
        public static final ExceptionExtensions<java.util.UnknownFormatFlagsException> UnknownFormatFlagsException = new ExceptionExtensions(java.util.UnknownFormatFlagsException.class);
        public static final ExceptionExtensions<java.util.zip.DataFormatException> DataFormatException = new ExceptionExtensions(java.util.zip.DataFormatException.class);
        public static final ExceptionExtensions<java.util.zip.ZipException> ZipException = new ExceptionExtensions(java.util.zip.ZipException.class);
    }

    public static class Javax{

        public static class Activation{
            public static final ExceptionExtensions<javax.activation.MimeTypeParseException> MimeTypeParseExceptionActivation = new ExceptionExtensions(javax.activation.MimeTypeParseException.class);
            public static final ExceptionExtensions<javax.activation.UnsupportedDataTypeException> UnsupportedDataTypeException = new ExceptionExtensions(javax.activation.UnsupportedDataTypeException.class);
        }

        public static class Activity{
            public static final ExceptionExtensions<javax.activity.ActivityCompletedException> ActivityCompletedException = new ExceptionExtensions(javax.activity.ActivityCompletedException.class);
            public static final ExceptionExtensions<javax.activity.ActivityRequiredException> ActivityRequiredException = new ExceptionExtensions(javax.activity.ActivityRequiredException.class);
            public static final ExceptionExtensions<javax.activity.InvalidActivityException> InvalidActivityException = new ExceptionExtensions(javax.activity.InvalidActivityException.class);
        }

        public static class Annotation{
            public static final ExceptionExtensions<javax.annotation.processing.FilerException> FilerException = new ExceptionExtensions(javax.annotation.processing.FilerException.class);
        }

        public static class Crypto{
            public static final ExceptionExtensions<javax.crypto.AEADBadTagException> AEADBadTagException = new ExceptionExtensions(javax.crypto.AEADBadTagException.class);
            public static final ExceptionExtensions<javax.crypto.BadPaddingException> BadPaddingException = new ExceptionExtensions(javax.crypto.BadPaddingException.class);
            public static final ExceptionExtensions<javax.crypto.ExemptionMechanismException> ExemptionMechanismException = new ExceptionExtensions(javax.crypto.ExemptionMechanismException.class);
            public static final ExceptionExtensions<javax.crypto.IllegalBlockSizeException> IllegalBlockSizeException = new ExceptionExtensions(javax.crypto.IllegalBlockSizeException.class);
            public static final ExceptionExtensions<javax.crypto.NoSuchPaddingException> NoSuchPaddingException = new ExceptionExtensions(javax.crypto.NoSuchPaddingException.class);
            public static final ExceptionExtensions<javax.crypto.ShortBufferException> ShortBufferException = new ExceptionExtensions(javax.crypto.ShortBufferException.class);
        }

        public static class ImageIO{
            public static final ExceptionExtensions<javax.imageio.IIOException> IIOException = new ExceptionExtensions(javax.imageio.IIOException.class);
            public static final ExceptionExtensions<javax.imageio.metadata.IIOInvalidTreeException> IIOInvalidTreeException = new ExceptionExtensions(javax.imageio.metadata.IIOInvalidTreeException.class);
        }

        public static class Lang{
            public static final ExceptionExtensions<javax.lang.model.element.UnknownAnnotationValueException> UnknownAnnotationValueException = new ExceptionExtensions(javax.lang.model.element.UnknownAnnotationValueException.class);
            public static final ExceptionExtensions<javax.lang.model.element.UnknownElementException> UnknownElementException = new ExceptionExtensions(javax.lang.model.element.UnknownElementException.class);
            public static final ExceptionExtensions<javax.lang.model.type.MirroredTypeException> MirroredTypeException = new ExceptionExtensions(javax.lang.model.type.MirroredTypeException.class);
            public static final ExceptionExtensions<javax.lang.model.type.MirroredTypesException> MirroredTypesException = new ExceptionExtensions(javax.lang.model.type.MirroredTypesException.class);
            public static final ExceptionExtensions<javax.lang.model.type.UnknownTypeException> UnknownTypeException = new ExceptionExtensions(javax.lang.model.type.UnknownTypeException.class);
            public static final ExceptionExtensions<javax.lang.model.UnknownEntityException> UnknownEntityException = new ExceptionExtensions(javax.lang.model.UnknownEntityException.class);
        }

        public static class Management{
            public static final ExceptionExtensions<javax.management.AttributeNotFoundException> AttributeNotFoundException = new ExceptionExtensions(javax.management.AttributeNotFoundException.class);
            public static final ExceptionExtensions<javax.management.BadAttributeValueExpException> BadAttributeValueExpException = new ExceptionExtensions(javax.management.BadAttributeValueExpException.class);
            public static final ExceptionExtensions<javax.management.BadBinaryOpValueExpException> BadBinaryOpValueExpException = new ExceptionExtensions(javax.management.BadBinaryOpValueExpException.class);
            public static final ExceptionExtensions<javax.management.BadStringOperationException> BadStringOperationException = new ExceptionExtensions(javax.management.BadStringOperationException.class);
            public static final ExceptionExtensions<javax.management.InstanceAlreadyExistsException> InstanceAlreadyExistsException = new ExceptionExtensions(javax.management.InstanceAlreadyExistsException.class);
            public static final ExceptionExtensions<javax.management.InstanceNotFoundException> InstanceNotFoundException = new ExceptionExtensions(javax.management.InstanceNotFoundException.class);
            public static final ExceptionExtensions<javax.management.IntrospectionException> IntrospectionExceptionManagement = new ExceptionExtensions(javax.management.IntrospectionException.class);
            public static final ExceptionExtensions<javax.management.InvalidApplicationException> InvalidApplicationException = new ExceptionExtensions(javax.management.InvalidApplicationException.class);
            public static final ExceptionExtensions<javax.management.InvalidAttributeValueException> InvalidAttributeValueExceptionManagement = new ExceptionExtensions(javax.management.InvalidAttributeValueException.class);
            public static final ExceptionExtensions<javax.management.JMException> JMException = new ExceptionExtensions(javax.management.JMException.class);
            public static final ExceptionExtensions<javax.management.JMRuntimeException> JMRuntimeException = new ExceptionExtensions(javax.management.JMRuntimeException.class);
            public static final ExceptionExtensions<javax.management.ListenerNotFoundException> ListenerNotFoundException = new ExceptionExtensions(javax.management.ListenerNotFoundException.class);
            public static final ExceptionExtensions<javax.management.MalformedObjectNameException> MalformedObjectNameException = new ExceptionExtensions(javax.management.MalformedObjectNameException.class);
            public static final ExceptionExtensions<javax.management.MBeanException> MBeanException = new ExceptionExtensions(javax.management.MBeanException.class);
            public static final ExceptionExtensions<javax.management.MBeanRegistrationException> MBeanRegistrationException = new ExceptionExtensions(javax.management.MBeanRegistrationException.class);
            public static final ExceptionExtensions<javax.management.modelmbean.InvalidTargetObjectTypeException> InvalidTargetObjectTypeException = new ExceptionExtensions(javax.management.modelmbean.InvalidTargetObjectTypeException.class);
            public static final ExceptionExtensions<javax.management.modelmbean.XMLParseException> XMLParseException = new ExceptionExtensions(javax.management.modelmbean.XMLParseException.class);
            public static final ExceptionExtensions<javax.management.monitor.MonitorSettingException> MonitorSettingException = new ExceptionExtensions(javax.management.monitor.MonitorSettingException.class);
            public static final ExceptionExtensions<javax.management.NotCompliantMBeanException> NotCompliantMBeanException = new ExceptionExtensions(javax.management.NotCompliantMBeanException.class);
            public static final ExceptionExtensions<javax.management.openmbean.InvalidKeyException> InvalidKeyExceptionOpenmbean = new ExceptionExtensions(javax.management.openmbean.InvalidKeyException.class);
            public static final ExceptionExtensions<javax.management.openmbean.InvalidOpenTypeException> InvalidOpenTypeException = new ExceptionExtensions(javax.management.openmbean.InvalidOpenTypeException.class);
            public static final ExceptionExtensions<javax.management.openmbean.KeyAlreadyExistsException> KeyAlreadyExistsException = new ExceptionExtensions(javax.management.openmbean.KeyAlreadyExistsException.class);
            public static final ExceptionExtensions<javax.management.openmbean.OpenDataException> OpenDataException = new ExceptionExtensions(javax.management.openmbean.OpenDataException.class);
            public static final ExceptionExtensions<javax.management.OperationsException> OperationsException = new ExceptionExtensions(javax.management.OperationsException.class);
            public static final ExceptionExtensions<javax.management.ReflectionException> ReflectionException = new ExceptionExtensions(javax.management.ReflectionException.class);
            public static final ExceptionExtensions<javax.management.relation.InvalidRelationIdException> InvalidRelationIdException = new ExceptionExtensions(javax.management.relation.InvalidRelationIdException.class);
            public static final ExceptionExtensions<javax.management.relation.InvalidRelationServiceException> InvalidRelationServiceException = new ExceptionExtensions(javax.management.relation.InvalidRelationServiceException.class);
            public static final ExceptionExtensions<javax.management.relation.InvalidRelationTypeException> InvalidRelationTypeException = new ExceptionExtensions(javax.management.relation.InvalidRelationTypeException.class);
            public static final ExceptionExtensions<javax.management.relation.InvalidRoleInfoException> InvalidRoleInfoException = new ExceptionExtensions(javax.management.relation.InvalidRoleInfoException.class);
            public static final ExceptionExtensions<javax.management.relation.InvalidRoleValueException> InvalidRoleValueException = new ExceptionExtensions(javax.management.relation.InvalidRoleValueException.class);
            public static final ExceptionExtensions<javax.management.relation.RelationException> RelationException = new ExceptionExtensions(javax.management.relation.RelationException.class);
            public static final ExceptionExtensions<javax.management.relation.RelationNotFoundException> RelationNotFoundException = new ExceptionExtensions(javax.management.relation.RelationNotFoundException.class);
            public static final ExceptionExtensions<javax.management.relation.RelationServiceNotRegisteredException> RelationServiceNotRegisteredException = new ExceptionExtensions(javax.management.relation.RelationServiceNotRegisteredException.class);
            public static final ExceptionExtensions<javax.management.relation.RelationTypeNotFoundException> RelationTypeNotFoundException = new ExceptionExtensions(javax.management.relation.RelationTypeNotFoundException.class);
            public static final ExceptionExtensions<javax.management.relation.RoleInfoNotFoundException> RoleInfoNotFoundException = new ExceptionExtensions(javax.management.relation.RoleInfoNotFoundException.class);
            public static final ExceptionExtensions<javax.management.relation.RoleNotFoundException> RoleNotFoundException = new ExceptionExtensions(javax.management.relation.RoleNotFoundException.class);
            public static final ExceptionExtensions<javax.management.remote.JMXProviderException> JMXProviderException = new ExceptionExtensions(javax.management.remote.JMXProviderException.class);
            public static final ExceptionExtensions<javax.management.remote.JMXServerErrorException> JMXServerErrorException = new ExceptionExtensions(javax.management.remote.JMXServerErrorException.class);
            public static final ExceptionExtensions<javax.management.RuntimeErrorException> RuntimeErrorException = new ExceptionExtensions(javax.management.RuntimeErrorException.class);
            public static final ExceptionExtensions<javax.management.RuntimeMBeanException> RuntimeMBeanException = new ExceptionExtensions(javax.management.RuntimeMBeanException.class);
            public static final ExceptionExtensions<javax.management.RuntimeOperationsException> RuntimeOperationsException = new ExceptionExtensions(javax.management.RuntimeOperationsException.class);
            public static final ExceptionExtensions<javax.management.ServiceNotFoundException> ServiceNotFoundException = new ExceptionExtensions(javax.management.ServiceNotFoundException.class);
        }

        public static class Naming{
            public static final ExceptionExtensions<javax.naming.AuthenticationException> AuthenticationExceptionNaming = new ExceptionExtensions(javax.naming.AuthenticationException.class);
            public static final ExceptionExtensions<javax.naming.AuthenticationNotSupportedException> AuthenticationNotSupportedException = new ExceptionExtensions(javax.naming.AuthenticationNotSupportedException.class);
            public static final ExceptionExtensions<javax.naming.CannotProceedException> CannotProceedException = new ExceptionExtensions(javax.naming.CannotProceedException.class);
            public static final ExceptionExtensions<javax.naming.CommunicationException> CommunicationException = new ExceptionExtensions(javax.naming.CommunicationException.class);
            public static final ExceptionExtensions<javax.naming.ConfigurationException> ConfigurationException = new ExceptionExtensions(javax.naming.ConfigurationException.class);
            public static final ExceptionExtensions<javax.naming.ContextNotEmptyException> ContextNotEmptyException = new ExceptionExtensions(javax.naming.ContextNotEmptyException.class);
            public static final ExceptionExtensions<javax.naming.directory.AttributeInUseException> AttributeInUseException = new ExceptionExtensions(javax.naming.directory.AttributeInUseException.class);
            public static final ExceptionExtensions<javax.naming.directory.AttributeModificationException> AttributeModificationException = new ExceptionExtensions(javax.naming.directory.AttributeModificationException.class);
            public static final ExceptionExtensions<javax.naming.directory.InvalidAttributeIdentifierException> InvalidAttributeIdentifierException = new ExceptionExtensions(javax.naming.directory.InvalidAttributeIdentifierException.class);
            public static final ExceptionExtensions<javax.naming.directory.InvalidAttributesException> InvalidAttributesException = new ExceptionExtensions(javax.naming.directory.InvalidAttributesException.class);
            public static final ExceptionExtensions<javax.naming.directory.InvalidAttributeValueException> InvalidAttributeValueExceptionDirectory = new ExceptionExtensions(javax.naming.directory.InvalidAttributeValueException.class);
            public static final ExceptionExtensions<javax.naming.directory.InvalidSearchControlsException> InvalidSearchControlsException = new ExceptionExtensions(javax.naming.directory.InvalidSearchControlsException.class);
            public static final ExceptionExtensions<javax.naming.directory.InvalidSearchFilterException> InvalidSearchFilterException = new ExceptionExtensions(javax.naming.directory.InvalidSearchFilterException.class);
            public static final ExceptionExtensions<javax.naming.directory.NoSuchAttributeException> NoSuchAttributeException = new ExceptionExtensions(javax.naming.directory.NoSuchAttributeException.class);
            public static final ExceptionExtensions<javax.naming.directory.SchemaViolationException> SchemaViolationException = new ExceptionExtensions(javax.naming.directory.SchemaViolationException.class);
            public static final ExceptionExtensions<javax.naming.InsufficientResourcesException> InsufficientResourcesException = new ExceptionExtensions(javax.naming.InsufficientResourcesException.class);
            public static final ExceptionExtensions<javax.naming.InterruptedNamingException> InterruptedNamingException = new ExceptionExtensions(javax.naming.InterruptedNamingException.class);
            public static final ExceptionExtensions<javax.naming.InvalidNameException> InvalidNameException = new ExceptionExtensions(javax.naming.InvalidNameException.class);
            public static final ExceptionExtensions<javax.naming.ldap.LdapReferralException> LdapReferralException = new ExceptionExtensions(javax.naming.ldap.LdapReferralException.class);
            public static final ExceptionExtensions<javax.naming.LimitExceededException> LimitExceededException = new ExceptionExtensions(javax.naming.LimitExceededException.class);
            public static final ExceptionExtensions<javax.naming.LinkException> LinkException = new ExceptionExtensions(javax.naming.LinkException.class);
            public static final ExceptionExtensions<javax.naming.LinkLoopException> LinkLoopException = new ExceptionExtensions(javax.naming.LinkLoopException.class);
            public static final ExceptionExtensions<javax.naming.MalformedLinkException> MalformedLinkException = new ExceptionExtensions(javax.naming.MalformedLinkException.class);
            public static final ExceptionExtensions<javax.naming.NameAlreadyBoundException> NameAlreadyBoundException = new ExceptionExtensions(javax.naming.NameAlreadyBoundException.class);
            public static final ExceptionExtensions<javax.naming.NameNotFoundException> NameNotFoundException = new ExceptionExtensions(javax.naming.NameNotFoundException.class);
            public static final ExceptionExtensions<javax.naming.NamingException> NamingException = new ExceptionExtensions(javax.naming.NamingException.class);
            public static final ExceptionExtensions<javax.naming.NamingSecurityException> NamingSecurityException = new ExceptionExtensions(javax.naming.NamingSecurityException.class);
            public static final ExceptionExtensions<javax.naming.NoInitialContextException> NoInitialContextException = new ExceptionExtensions(javax.naming.NoInitialContextException.class);
            public static final ExceptionExtensions<javax.naming.NoPermissionException> NoPermissionException = new ExceptionExtensions(javax.naming.NoPermissionException.class);
            public static final ExceptionExtensions<javax.naming.NotContextException> NotContextException = new ExceptionExtensions(javax.naming.NotContextException.class);
            public static final ExceptionExtensions<javax.naming.OperationNotSupportedException> OperationNotSupportedException = new ExceptionExtensions(javax.naming.OperationNotSupportedException.class);
            public static final ExceptionExtensions<javax.naming.PartialResultException> PartialResultException = new ExceptionExtensions(javax.naming.PartialResultException.class);
            public static final ExceptionExtensions<javax.naming.ReferralException> ReferralException = new ExceptionExtensions(javax.naming.ReferralException.class);
            public static final ExceptionExtensions<javax.naming.ServiceUnavailableException> ServiceUnavailableException = new ExceptionExtensions(javax.naming.ServiceUnavailableException.class);
            public static final ExceptionExtensions<javax.naming.SizeLimitExceededException> SizeLimitExceededException = new ExceptionExtensions(javax.naming.SizeLimitExceededException.class);
            public static final ExceptionExtensions<javax.naming.TimeLimitExceededException> TimeLimitExceededException = new ExceptionExtensions(javax.naming.TimeLimitExceededException.class);
        }

        public static class Net{
            public static final ExceptionExtensions<javax.net.ssl.SSLException> SSLException = new ExceptionExtensions(javax.net.ssl.SSLException.class);
            public static final ExceptionExtensions<javax.net.ssl.SSLHandshakeException> SSLHandshakeException = new ExceptionExtensions(javax.net.ssl.SSLHandshakeException.class);
            public static final ExceptionExtensions<javax.net.ssl.SSLKeyException> SSLKeyException = new ExceptionExtensions(javax.net.ssl.SSLKeyException.class);
            public static final ExceptionExtensions<javax.net.ssl.SSLPeerUnverifiedException> SSLPeerUnverifiedException = new ExceptionExtensions(javax.net.ssl.SSLPeerUnverifiedException.class);
            public static final ExceptionExtensions<javax.net.ssl.SSLProtocolException> SSLProtocolException = new ExceptionExtensions(javax.net.ssl.SSLProtocolException.class);
        }

        public static class Print{
            public static final ExceptionExtensions<javax.print.attribute.UnmodifiableSetException> UnmodifiableSetException = new ExceptionExtensions(javax.print.attribute.UnmodifiableSetException.class);
            public static final ExceptionExtensions<javax.print.PrintException> PrintException = new ExceptionExtensions(javax.print.PrintException.class);
        }

        public static class Script{
            public static final ExceptionExtensions<javax.script.ScriptException> ScriptException = new ExceptionExtensions(javax.script.ScriptException.class);
        }

        public static class Security{
            public static final ExceptionExtensions<javax.security.auth.callback.UnsupportedCallbackException> UnsupportedCallbackException = new ExceptionExtensions(javax.security.auth.callback.UnsupportedCallbackException.class);
            public static final ExceptionExtensions<javax.security.auth.DestroyFailedException> DestroyFailedException = new ExceptionExtensions(javax.security.auth.DestroyFailedException.class);
            public static final ExceptionExtensions<javax.security.auth.login.AccountException> AccountException = new ExceptionExtensions(javax.security.auth.login.AccountException.class);
            public static final ExceptionExtensions<javax.security.auth.login.AccountExpiredException> AccountExpiredException = new ExceptionExtensions(javax.security.auth.login.AccountExpiredException.class);
            public static final ExceptionExtensions<javax.security.auth.login.AccountLockedException> AccountLockedException = new ExceptionExtensions(javax.security.auth.login.AccountLockedException.class);
            public static final ExceptionExtensions<javax.security.auth.login.AccountNotFoundException> AccountNotFoundException = new ExceptionExtensions(javax.security.auth.login.AccountNotFoundException.class);
            public static final ExceptionExtensions<javax.security.auth.login.CredentialException> CredentialException = new ExceptionExtensions(javax.security.auth.login.CredentialException.class);
            public static final ExceptionExtensions<javax.security.auth.login.CredentialExpiredException> CredentialExpiredException = new ExceptionExtensions(javax.security.auth.login.CredentialExpiredException.class);
            public static final ExceptionExtensions<javax.security.auth.login.CredentialNotFoundException> CredentialNotFoundException = new ExceptionExtensions(javax.security.auth.login.CredentialNotFoundException.class);
            public static final ExceptionExtensions<javax.security.auth.login.FailedLoginException> FailedLoginException = new ExceptionExtensions(javax.security.auth.login.FailedLoginException.class);
            public static final ExceptionExtensions<javax.security.auth.login.LoginException> LoginException = new ExceptionExtensions(javax.security.auth.login.LoginException.class);
            public static final ExceptionExtensions<javax.security.auth.RefreshFailedException> RefreshFailedException = new ExceptionExtensions(javax.security.auth.RefreshFailedException.class);
            public static final ExceptionExtensions<javax.security.cert.CertificateEncodingException> CertificateEncodingExceptionJavax = new ExceptionExtensions(javax.security.cert.CertificateEncodingException.class);
            public static final ExceptionExtensions<javax.security.cert.CertificateException> CertificateExceptionJavax = new ExceptionExtensions(javax.security.cert.CertificateException.class);
            public static final ExceptionExtensions<javax.security.cert.CertificateExpiredException> CertificateExpiredExceptionJavax = new ExceptionExtensions(javax.security.cert.CertificateExpiredException.class);
            public static final ExceptionExtensions<javax.security.cert.CertificateNotYetValidException> CertificateNotYetValidExceptionJavax = new ExceptionExtensions(javax.security.cert.CertificateNotYetValidException.class);
            public static final ExceptionExtensions<javax.security.cert.CertificateParsingException> CertificateParsingExceptionJavax = new ExceptionExtensions(javax.security.cert.CertificateParsingException.class);
            public static final ExceptionExtensions<javax.security.sasl.AuthenticationException> AuthenticationExceptionSasl = new ExceptionExtensions(javax.security.sasl.AuthenticationException.class);
            public static final ExceptionExtensions<javax.security.sasl.SaslException> SaslException = new ExceptionExtensions(javax.security.sasl.SaslException.class);
        }

        public static class Sound{
            public static final ExceptionExtensions<javax.sound.midi.InvalidMidiDataException> InvalidMidiDataException = new ExceptionExtensions(javax.sound.midi.InvalidMidiDataException.class);
            public static final ExceptionExtensions<javax.sound.midi.MidiUnavailableException> MidiUnavailableException = new ExceptionExtensions(javax.sound.midi.MidiUnavailableException.class);
            public static final ExceptionExtensions<javax.sound.sampled.LineUnavailableException> LineUnavailableException = new ExceptionExtensions(javax.sound.sampled.LineUnavailableException.class);
            public static final ExceptionExtensions<javax.sound.sampled.UnsupportedAudioFileException> UnsupportedAudioFileException = new ExceptionExtensions(javax.sound.sampled.UnsupportedAudioFileException.class);
        }

        public static class Sql{
            public static final ExceptionExtensions<javax.sql.rowset.serial.SerialException> SerialException = new ExceptionExtensions(javax.sql.rowset.serial.SerialException.class);
            public static final ExceptionExtensions<javax.sql.rowset.spi.SyncFactoryException> SyncFactoryException = new ExceptionExtensions(javax.sql.rowset.spi.SyncFactoryException.class);
            public static final ExceptionExtensions<javax.sql.rowset.spi.SyncProviderException> SyncProviderException = new ExceptionExtensions(javax.sql.rowset.spi.SyncProviderException.class);
        }


        public static class Swing{
            public static final ExceptionExtensions<javax.swing.text.BadLocationException> BadLocationException = new ExceptionExtensions(javax.swing.text.BadLocationException.class);
            public static final ExceptionExtensions<javax.swing.text.ChangedCharSetException> ChangedCharSetException = new ExceptionExtensions(javax.swing.text.ChangedCharSetException.class);
            public static final ExceptionExtensions<javax.swing.tree.ExpandVetoException> ExpandVetoException = new ExceptionExtensions(javax.swing.tree.ExpandVetoException.class);
            public static final ExceptionExtensions<javax.swing.undo.CannotRedoException> CannotRedoException = new ExceptionExtensions(javax.swing.undo.CannotRedoException.class);
            public static final ExceptionExtensions<javax.swing.undo.CannotUndoException> CannotUndoException = new ExceptionExtensions(javax.swing.undo.CannotUndoException.class);
            public static final ExceptionExtensions<javax.swing.UnsupportedLookAndFeelException> UnsupportedLookAndFeelException = new ExceptionExtensions(javax.swing.UnsupportedLookAndFeelException.class);
        }

        public static class Transaction{
            public static final ExceptionExtensions<javax.transaction.InvalidTransactionException> InvalidTransactionException = new ExceptionExtensions(javax.transaction.InvalidTransactionException.class);
            public static final ExceptionExtensions<javax.transaction.TransactionRequiredException> TransactionRequiredException = new ExceptionExtensions(javax.transaction.TransactionRequiredException.class);
            public static final ExceptionExtensions<javax.transaction.TransactionRolledbackException> TransactionRolledbackException = new ExceptionExtensions(javax.transaction.TransactionRolledbackException.class);
        }

        public static class Xml{
            public static final ExceptionExtensions<javax.transaction.xa.XAException> XAException = new ExceptionExtensions(javax.transaction.xa.XAException.class);
            public static final ExceptionExtensions<javax.xml.bind.DataBindingException> DataBindingException = new ExceptionExtensions(javax.xml.bind.DataBindingException.class);
            public static final ExceptionExtensions<javax.xml.bind.JAXBException> JAXBException = new ExceptionExtensions(javax.xml.bind.JAXBException.class);
            public static final ExceptionExtensions<javax.xml.bind.MarshalException> MarshalExceptionXml = new ExceptionExtensions(javax.xml.bind.MarshalException.class);
            public static final ExceptionExtensions<javax.xml.bind.PropertyException> PropertyException = new ExceptionExtensions(javax.xml.bind.PropertyException.class);
            public static final ExceptionExtensions<javax.xml.bind.TypeConstraintException> TypeConstraintException = new ExceptionExtensions(javax.xml.bind.TypeConstraintException.class);
            public static final ExceptionExtensions<javax.xml.bind.UnmarshalException> UnmarshalExceptionXml = new ExceptionExtensions(javax.xml.bind.UnmarshalException.class);
            public static final ExceptionExtensions<javax.xml.bind.ValidationException> ValidationException = new ExceptionExtensions(javax.xml.bind.ValidationException.class);
            public static final ExceptionExtensions<javax.xml.crypto.dsig.TransformException> TransformException = new ExceptionExtensions(javax.xml.crypto.dsig.TransformException.class);
            public static final ExceptionExtensions<javax.xml.crypto.dsig.XMLSignatureException> XMLSignatureException = new ExceptionExtensions(javax.xml.crypto.dsig.XMLSignatureException.class);
            public static final ExceptionExtensions<javax.xml.crypto.KeySelectorException> KeySelectorException = new ExceptionExtensions(javax.xml.crypto.KeySelectorException.class);
            public static final ExceptionExtensions<javax.xml.crypto.MarshalException> MarshalException = new ExceptionExtensions(javax.xml.crypto.MarshalException.class);
            public static final ExceptionExtensions<javax.xml.crypto.NoSuchMechanismException> NoSuchMechanismException = new ExceptionExtensions(javax.xml.crypto.NoSuchMechanismException.class);
            public static final ExceptionExtensions<javax.xml.crypto.URIReferenceException> URIReferenceException = new ExceptionExtensions(javax.xml.crypto.URIReferenceException.class);
            public static final ExceptionExtensions<javax.xml.datatype.DatatypeConfigurationException> DatatypeConfigurationException = new ExceptionExtensions(javax.xml.datatype.DatatypeConfigurationException.class);
            public static final ExceptionExtensions<javax.xml.parsers.ParserConfigurationException> ParserConfigurationException = new ExceptionExtensions(javax.xml.parsers.ParserConfigurationException.class);
            public static final ExceptionExtensions<javax.xml.soap.SOAPException> SOAPException = new ExceptionExtensions(javax.xml.soap.SOAPException.class);
            public static final ExceptionExtensions<javax.xml.stream.XMLStreamException> XMLStreamException = new ExceptionExtensions(javax.xml.stream.XMLStreamException.class);
            public static final ExceptionExtensions<javax.xml.transform.TransformerConfigurationException> TransformerConfigurationException = new ExceptionExtensions(javax.xml.transform.TransformerConfigurationException.class);
            public static final ExceptionExtensions<javax.xml.transform.TransformerException> TransformerException = new ExceptionExtensions(javax.xml.transform.TransformerException.class);
            public static final ExceptionExtensions<javax.xml.ws.http.HTTPException> HTTPException = new ExceptionExtensions(javax.xml.ws.http.HTTPException.class);
            public static final ExceptionExtensions<javax.xml.ws.ProtocolException> ProtocolExceptionWs = new ExceptionExtensions(javax.xml.ws.ProtocolException.class);
            public static final ExceptionExtensions<javax.xml.ws.soap.SOAPFaultException> SOAPFaultException = new ExceptionExtensions(javax.xml.ws.soap.SOAPFaultException.class);
            public static final ExceptionExtensions<javax.xml.ws.WebServiceException> WebServiceException = new ExceptionExtensions(javax.xml.ws.WebServiceException.class);
            public static final ExceptionExtensions<javax.xml.xpath.XPathException> XPathException = new ExceptionExtensions(javax.xml.xpath.XPathException.class);
            public static final ExceptionExtensions<javax.xml.xpath.XPathExpressionException> XPathExpressionException = new ExceptionExtensions(javax.xml.xpath.XPathExpressionException.class);
            public static final ExceptionExtensions<javax.xml.xpath.XPathFactoryConfigurationException> XPathFactoryConfigurationException = new ExceptionExtensions(javax.xml.xpath.XPathFactoryConfigurationException.class);
            public static final ExceptionExtensions<javax.xml.xpath.XPathFunctionException> XPathFunctionException = new ExceptionExtensions(javax.xml.xpath.XPathFunctionException.class);
        }

    }

    public static class Org{
        public static class Omg{
            public static final ExceptionExtensions<org.ietf.jgss.GSSException> GSSException = new ExceptionExtensions(org.ietf.jgss.GSSException.class);
            public static final ExceptionExtensions<org.omg.CORBA.portable.ApplicationException> ApplicationException = new ExceptionExtensions(org.omg.CORBA.portable.ApplicationException.class);
            public static final ExceptionExtensions<org.omg.CORBA.portable.IndirectionException> IndirectionException = new ExceptionExtensions(org.omg.CORBA.portable.IndirectionException.class);
            public static final ExceptionExtensions<org.omg.CORBA.portable.RemarshalException> RemarshalException = new ExceptionExtensions(org.omg.CORBA.portable.RemarshalException.class);
            public static final ExceptionExtensions<org.omg.CORBA.portable.UnknownException> UnknownException = new ExceptionExtensions(org.omg.CORBA.portable.UnknownException.class);
            public static final ExceptionExtensions<org.omg.CORBA.SystemException> SystemException = new ExceptionExtensions(org.omg.CORBA.SystemException.class);
            public static final ExceptionExtensions<org.omg.CORBA.UnknownUserException> UnknownUserException = new ExceptionExtensions(org.omg.CORBA.UnknownUserException.class);
            public static final ExceptionExtensions<org.omg.CORBA.UserException> UserException = new ExceptionExtensions(org.omg.CORBA.UserException.class);
        }

        public static class W3c{
            public static final ExceptionExtensions<org.w3c.dom.DOMException> DOMException = new ExceptionExtensions(org.w3c.dom.DOMException.class);
            public static final ExceptionExtensions<org.w3c.dom.events.EventException> EventException = new ExceptionExtensions(org.w3c.dom.events.EventException.class);
            public static final ExceptionExtensions<org.w3c.dom.ls.LSException> LSException = new ExceptionExtensions(org.w3c.dom.ls.LSException.class);
        }

        public static class Xml{
            public static final ExceptionExtensions<org.xml.sax.SAXException> SAXException = new ExceptionExtensions(org.xml.sax.SAXException.class);
            public static final ExceptionExtensions<org.xml.sax.SAXNotRecognizedException> SAXNotRecognizedException = new ExceptionExtensions(org.xml.sax.SAXNotRecognizedException.class);
            public static final ExceptionExtensions<org.xml.sax.SAXNotSupportedException> SAXNotSupportedException = new ExceptionExtensions(org.xml.sax.SAXNotSupportedException.class);
            public static final ExceptionExtensions<org.xml.sax.SAXParseException> SAXParseException = new ExceptionExtensions(org.xml.sax.SAXParseException.class);
        }
    }



    private Class exceptionClass;

    /**
     * Instantiate Exception Extension
     *
     * @param exceptionClass Exception Class
     */
    public ExceptionExtensions(Class exceptionClass) {
        this.exceptionClass = exceptionClass;
    }


    /**
     * Exception.when throws exception when the condition is true
     *
     * @param condition If true, then exception is thrown
     * @param msg       Msg to display (uses String.format)
     * @param args      optional varArgs for string format
     * @throws T
     */
    public void when(boolean condition, String msg, Object... args) throws T {
        if (condition) {
            throwException(msg, args);
        }
    }


    /**
     * Exception.ifNull throws exception if the passed object is null
     *
     * @param o    object to check if null
     * @param msg  Msg to display (uses String.format)
     * @param args optional varArgs for string format
     * @throws T
     */
    public void ifNull(Object o, String msg, Object... args) throws T {
        when(o == null, msg, args);
    }


    /**
     * Throws exception with a formatted message, this should only be
     * called if you are extending this class.
     *
     * @param msg  Msg to display (uses String.format)
     * @param args optional varArgs for string format
     * @throws T
     */
    protected void throwException(String msg, Object[] args) throws T {
        try {
            String formattedMessage = String.format(msg, args);
            throw (T) exceptionClass.getConstructor(String.class).newInstance(formattedMessage);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}