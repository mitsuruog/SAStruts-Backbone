SAStruts-Backbone
=================

SAStruts+Backbone.jsのプロトタイプ

できること
------
+ Sync先のURLとActionの連携
+ Bacbone.Syncの以下のRESTメソッド
 - GET : JSONでのレスポンス 
 - POST : リクエストパラメータの受け渡し
+ 認証周り
 - 基本認証
 - Session
 - （↑それぞれAction名指定してInterceptできるので、後は実際の実装してみるのみ）

やりたいこと
------
+ SAStrutsのアノテーションバリデータのエラー検出時にJSONでメッセージを返す。
 - （補足）検証メソッドはActionMessagesThrowsInterceptorをDIすればOK。
+ Bacbone.Syncの以下のRESTメソッド
 - PUT
 - （↑うーん、URLリソース表現として割り切るか、emulateHTTPするか悩む。）
+ 認証周り
 - 基本認証（認証ロジックとテスト用ドライバの実装）
 - Session（認証ロジックとテスト用ドライバの実装）

