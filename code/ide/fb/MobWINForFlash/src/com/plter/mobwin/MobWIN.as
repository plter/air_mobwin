package com.plter.mobwin
{
	import flash.events.EventDispatcher;
	import flash.external.ExtensionContext;
	
	public class MobWIN extends EventDispatcher
	{
		
		private static var __locked:Boolean=true;
		private static var __mobwin:MobWIN=null;
		
		public static function get mobWIN():MobWIN{
			if (__mobwin==null) 
			{
				__locked=false;
				__mobwin = new MobWIN;
				__locked=true;
			}
			
			return __mobwin;
		}
		
		
		public function get isSupported():Boolean{
			return _ec!=null;
		}
		
		
		
		
		private var _ec:ExtensionContext=null;
		
		public function MobWIN()
		{
			
			if (__locked) 
			{
				throw new Error("该类无法被实例化");
			}
			
			_ec= ExtensionContext.createExtensionContext(ID,null);
		}
		
		
		public function removeBanner():void{
			_ec.call("removeBanner");
		}
		
		
		public function addBannerToTop():void{
			_ec.call("addBannerToTop");
		}
		
		
		public function addBannerToBottom():void{
			_ec.call("addBannerToBottom");
		}
		
		
		private static const ID:String = "com.plter.mobwin";
	}
}