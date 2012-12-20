SAStruts-Backbone
=================

SAStruts+Backbone.jsのプロトタイプ

できること
------
+ Sync先のURLとActionの連携
+ Bacbone.Syncの以下のRESTメソッド
 - GET : JSONでのレスポンス 
 - POST : リクエストパラメータの受け渡し _(なお、PUT,DELETEはHTTPメソッドではなくURL表現で行う。)_
+ 認証周り
 - Session
 - （↑それぞれAction名指定してInterceptできるので、後は実際の実装してみるのみ）
+ アクセスログ

やりたいこと
------
+ SAStrutsのアノテーションバリデータのエラー検出時にJSONでメッセージを返す。
 - （補足）検証メソッドはActionMessagesThrowsInterceptorをDIすればOK。
+ Bacbone.SyncのOrverride
 - URLとAjaxリクエストの偽装
+ 認証周り
 - Session（認証ロジックとテスト用ドライバの実装）

RESTインターフェース
------
例）

**GET**
+ api/order/
 + →apiパッケージのOrderActionのindex()
+ api/order/111
 + →apiパッケージのOrderActionのget()

````
@Execute(validator = false)
public String index() {
  return null;
}

@Execute(validator = false, urlPattern="{id}")
public String get(){
  return null;
} 
````

**POST**
+ api/order/111/update
 + →apiパッケージのOrderActionのupdate()

````
@Execute(validator = false, urlPattern="{id}/update")
public String update(){
  return null;
}
````

**PUT**
+ api/order/111/add
 + →apiパッケージのOrderActionのadd()

````
@Execute(validator = false, urlPattern="{id}/add")
public String add(){
  return null;
}
````

**DELETE**
+ api/order/111/delete
 + →apiパッケージのOrderActionのdelete()

````
@Execute(validator = false, urlPattern="{id}/delete")
public String delete(){
  return null;
}
````

