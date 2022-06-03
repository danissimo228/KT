from request_methods import create_user, get_user_by_name, update_user, delete_user, headers, post_headers

def test_positive_create_user():
    name = "user"
    res = create_user(post_headers, name=name)
    status = res[0]
    assert status == 200

def test_positive_user_by_name():
    name = "user"
    res = get_user_by_name(headers, name)
    status = res[0]
    assert status == 200

def test_negative_user_by_name():
    name = "jhkjguionooiohi"
    res = get_user_by_name(headers, name)
    status = res[0]
    assert status == 404

def test_positive_update_user():
    name = "user"
    new_id = 41
    new_firstName = "NewFirstName"
    res = update_user(post_headers, id=new_id, name=name, firstname=new_firstName)
    status = res[0]
    assert status == 200 and get_user_by_name(headers, name)[1]["id"] == new_id

def test_positive_delete_user():
    name = "user"
    res = delete_user(headers, name)
    status = res[0]
    assert status == 200

def test_negative_delete_user():
    name = "dgfljdjslkhslkdf"
    res = delete_user(headers, name)
    status = res[0]
    assert status == 404
