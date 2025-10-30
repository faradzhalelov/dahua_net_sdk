package com.company.CodecSDK;

public class ICodecSDK {
	static {
		try
		{
			System.loadLibrary("aaccodec");
			System.loadLibrary("amrcodec");
		}
		catch(UnsatisfiedLinkError ulink)
		{    
	        ulink.printStackTrace();   
	    }
	}
	
	public static native long				AACEncInit();
	public static native long 				AACEncSetFormat(AAC_ENC_Format pFormat, long handle);
	public static native int				AACEncEncode(long handle, AudioBuf pAudioInBuf, byte pOutBuf[], Integer nDstLen);
	public static native int				AACEncDeInit(long handle);
	
	public static native long 				amrEncInit();
	public static native int				amrEncSetFormat(long handle, Setformat hsetform);
	public static native int				amrEncEncode(long handle, AudioBuf pAudioInBuf, byte pOutBuf[], Integer nDstLen);
	public static native int 				amrEncDeInit(long handle);
}
